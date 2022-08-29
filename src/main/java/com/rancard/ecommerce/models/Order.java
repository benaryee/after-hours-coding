package com.rancard.ecommerce.models;


import lombok.Data;

import java.util.Date;

@Data
public class Order {

    private String orderId;
    private Date orderDate;
    private OrderStatus orderStatus;
    private String customerId;
    private String item;

    public enum OrderStatus {
        PENDING,
        COMPLETED,
        CANCELLED
    }

    public String getOrderId() {
        return orderId;
    }
}
