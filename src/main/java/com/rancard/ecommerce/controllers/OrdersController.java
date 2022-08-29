package com.rancard.ecommerce.controllers;


import com.rancard.ecommerce.models.request.OrderCreationRequest;
import com.rancard.ecommerce.models.response.ApiResponse;
import com.rancard.ecommerce.services.OrdersService;
import com.rancard.ecommerce.utils.ApiUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService, ApiUtils apiUtils) {
        this.ordersService = ordersService;
    }


    @GetMapping("")
    public ApiResponse getOrders(HttpServletRequest request) {
        long start = System.currentTimeMillis();
        String sessionId = request.getSession().getId();
        log.info("["+sessionId+"] about to get orders");
        return ordersService.getOrders(sessionId);
    }

    @PostMapping("")
    public ApiResponse createOrder(HttpServletRequest request , @RequestBody OrderCreationRequest order) {
        String sessionId = request.getSession().getId();
        log.info("["+sessionId+"] about to create order");
        return ordersService.createOrder(order,sessionId);
    }



}
