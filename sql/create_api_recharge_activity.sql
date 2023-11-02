-- auto-generated definition
create table recharge_activity
(
    id         bigint auto_increment comment 'id'
        primary key,
    userId     bigint                             not null comment '用户id',
    productId  bigint                             not null comment '商品id',
    orderNo    varchar(256)                       null comment '商户订单号',
    createTime datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete   tinyint  default 0                 not null comment '是否删除'
)
    comment '充值活动表';

