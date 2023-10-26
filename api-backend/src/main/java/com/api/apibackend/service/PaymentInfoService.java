package com.api.apibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api.apibackend.model.entity.PaymentInfo;
import com.api.apibackend.model.vo.PaymentInfoVo;

/**
 * @Description: 支付信息服务
 */
public interface PaymentInfoService extends IService<PaymentInfo> {
    /**
     * 创建付款信息
     *
     * @param paymentInfoVo 付款信息vo
     * @return boolean
     */
    boolean createPaymentInfo(PaymentInfoVo paymentInfoVo);
}
