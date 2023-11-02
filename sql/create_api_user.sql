-- auto-generated definition
create table user
(
    id             bigint auto_increment comment 'id'
        primary key,
    userName       varchar(256)                           null comment '用户昵称',
    userAccount    varchar(256)                           not null comment '账号',
    userAvatar     varchar(1024)                          null comment '用户头像',
    email          varchar(256)                           null comment '邮箱',
    gender         varchar(10)                            null comment '性别 0-男 1-女',
    userRole       varchar(256) default 'user'            not null comment '用户角色：user / admin',
    userPassword   varchar(512)                           null comment '密码',
    accessKey      varchar(256)                           null comment 'accessKey',
    secretKey      varchar(256)                           null comment 'secretKey',
    balance        bigint       default 30                not null comment '钱包余额,注册送30币',
    invitationCode varchar(256)                           null comment '邀请码',
    status         tinyint      default 0                 not null comment '账号状态（0- 正常 1- 封号）',
    createTime     datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    updateTime     datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    isDelete       varchar(10)  default '0'               null comment '是否删除 0-未删除 null-已删除',
    constraint uni_userAccount
        unique (userAccount, isDelete)
)
    comment '用户';

