-- auto-generated definition
create table interface_info
(
    id             bigint auto_increment comment 'id'
        primary key,
    name           varchar(256)                           not null comment '接口名称',
    url            varchar(256)                           not null comment '接口地址',
    userId         bigint                                 null comment '发布人',
    method         varchar(256)                           not null comment '请求方法',
    requestParams  text                                   null comment '接口请求参数',
    reduceScore    bigint       default 0                 null comment '扣除积分数',
    requestExample text                                   null comment '请求示例',
    requestHeader  text                                   null comment '请求头',
    responseHeader text                                   null comment '响应头',
    description    varchar(256)                           null comment '描述信息',
    status         tinyint      default 0                 not null comment '接口状态（0- 默认下线 1- 上线）',
    totalInvokes   bigint       default 0                 not null comment '接口总调用次数',
    avatarUrl      varchar(1024)                          null comment '接口头像',
    returnFormat   varchar(512) default 'JSON'            null comment '返回格式(JSON等等)',
    responseParams text                                   null comment '接口响应参数',
    createTime     datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime     datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete       tinyint      default 0                 not null comment '是否删除'
)
    comment '接口信息';

