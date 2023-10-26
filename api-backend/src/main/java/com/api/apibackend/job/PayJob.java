package com.api.apibackend.job;

import com.api.apibackend.model.enums.PayTypeStatusEnum;
import com.api.apibackend.service.OrderService;
import com.api.apibackend.service.ProductOrderService;
import com.api.apibackend.model.entity.ProductOrder;
import com.api.apibackend.utils.RedissonLockUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: 支付定时任务
 */
@Slf4j
@Component
public class PayJob {
    @Resource
    private ProductOrderService productOrderService;
    @Resource
    private OrderService orderService;
    @Resource
    private RedissonLockUtil redissonLockUtil;

    /**
     * 微信订单确认
     * 每25s查询一次超过5分钟过期的订单,并且未支付
     */
    @Scheduled(cron = "0/25 * * * * ?")
    public void wxOrderConfirm() {
        redissonLockUtil.redissonDistributedLocks("wxOrderConfirm", () -> {
            List<ProductOrder> orderList = orderService.getNoPayOrderByDuration(5, false, PayTypeStatusEnum.WX.getValue());
            ProductOrderService productOrderService = orderService.getProductOrderServiceByPayType(PayTypeStatusEnum.WX.getValue());
            for (ProductOrder productOrder : orderList) {
                String orderNo = productOrder.getOrderNo();
                try {
                    productOrderService.processingTimedOutOrders(productOrder);
                } catch (Exception e) {
                    log.error("微信超时订单,{},确认异常：{}", orderNo, e.getMessage());
                    break;
                }
            }
        });
    }

    /**
     * 支付宝订单确认（主动向支付宝发出请求查询订单信息）
     * 每20s查询一次超过5分钟过期的订单,并且未支付
     */
    @Scheduled(cron = "0/20 * * * * ?")
    public void aliPayOrderConfirm() {
        redissonLockUtil.redissonDistributedLocks("aliPayOrderConfirm", () -> {
            List<ProductOrder> orderList = orderService.getNoPayOrderByDuration(5, false, PayTypeStatusEnum.ALIPAY.getValue());
//            List<ProductOrder> orderList = orderService.getNoPayOrderByDuration(1, false, ALIPAY.getValue());
            ProductOrderService productOrderService = orderService.getProductOrderServiceByPayType(PayTypeStatusEnum.ALIPAY.getValue());
            for (ProductOrder productOrder : orderList) {
                String orderNo = productOrder.getOrderNo();
                try {
                    productOrderService.processingTimedOutOrders(productOrder);
                } catch (Exception e) {
                    log.error("支付宝超时订单,{},确认异常：{}", orderNo, e.getMessage());
                    break;
                }
            }
        });
    }

    /**
     * 订单确认
     * 每2点删除一次15天前的订单,并且未支付，并且已关闭的订单
     */
    @Scheduled(cron = "* * 2 * * ?")
    public void clearOverdueOrders() {
        redissonLockUtil.redissonDistributedLocks("clearOverdueOrders", () -> {
            List<ProductOrder> orderList = orderService.getNoPayOrderByDuration(15 * 24 * 60, true, "");
            boolean removeResult = productOrderService.removeBatchByIds(orderList);
            if (removeResult) {
                log.info("清除成功");
            }
        });
    }
}
