package com.api.apibackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: id请求
 */
@Data
public class IdRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
}