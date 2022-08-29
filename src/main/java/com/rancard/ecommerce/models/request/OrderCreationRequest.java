package com.rancard.ecommerce.models.request;

import lombok.Data;

@Data
public class OrderCreationRequest {

    private String orderId;

    private String item;


}
