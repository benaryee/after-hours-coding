package com.rancard.ecommerce.models.response;

import lombok.Data;

@Data
public class ApiResponse {

    private int code;
    private String message;
    private Object data;
    private String requestId;
    private long duration;
}
