package com.api.apibackend.model.dto.interfaceinfo;

import lombok.Data;

/**
 * @Description: 接口信息更新头像请求
 */
@Data
public class InterfaceInfoUpdateAvatarRequest {
    private static final long serialVersionUID = 1L;
    private long id;
    /**
     * 接口头像
     */
    private String avatarUrl;
}
