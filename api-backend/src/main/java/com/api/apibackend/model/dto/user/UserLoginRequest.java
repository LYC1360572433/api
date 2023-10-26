package com.api.apibackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 用户账号登录请求体
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;
}
