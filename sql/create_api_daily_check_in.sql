-- auto-generated definition
create table daily_check_in
(
    id          bigint auto_increment comment 'id'
        primary key,
    userId      bigint                             not null comment '签到人',
    description varchar(256)                       null comment '描述',
    addPoints   bigint   default 10                not null comment '签到增加积分个数',
    createTime  datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime  datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
)
    comment '每日签到表';
