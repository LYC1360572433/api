package com.api.apibackend.model.dto.productinfo;

import com.api.apibackend.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Description: 产品信息查询请求
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ProductInfoQueryRequest extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品名称
     */
    private String name;
    /**
     * 增加积分个数
     */
    private Integer addPoints;

    /**
     * 产品描述
     */
    private String description;

    /**
     * 金额
     */
    private Double total;

    /**
     * 产品类型（VIP-VIP会员 RECHARGE-积分充值 RECHARGEACTIVITY-充值活动）
     */
    private String productType;

    /**
     * 状态（0- 默认下线 1- 上线）
     */
    private Integer status;

}