package com.api.apibackend.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 产品信息
 */
@TableName(value = "product_info")
@Data
public class ProductInfo implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 产品名称
     */
    private String name;
    /**
     * 状态（0- 审核中 1- 上线 2 - 下线）
     */
    private Integer status;
    /**
     * 增加积分个数
     */
    private Integer addPoints;
    /**
     * 产品描述
     */
    private String description;
    /**
     * 创建人
     */
    private Long userId;
    /**
     * 金额
     */
    private Double total;
    /**
     * 产品类型（VIP-VIP会员 RECHARGE-积分充值 RECHARGEACTIVITY-充值活动）
     */
    private String productType;
    /**
     * 过期时间
     */
    private Date expirationTime;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;
}