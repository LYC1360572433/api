package com.lyc.apisdk.exception;

import lombok.Data;

/**
 * @Description:
 */
@Data
public class ErrorResponse {
    private String message;
    private int code;
}
