package com.api.apibackend.model.dto.interfaceinfo;

import lombok.Data;

/**
 * @Description: 响应参数字段
 */
@Data
public class ResponseParamsField {
    private String id;
    private String fieldName;
    private String type;
    private String desc;
}