package com.api.apibackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 用户邮件登录请求体
 */
@Data
public class UserEmailLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String emailAccount;

    private String captcha;
}
