package com.rancard.ecommerce.services;

import com.rancard.ecommerce.models.Order;
import com.rancard.ecommerce.models.request.OrderCreationRequest;
import com.rancard.ecommerce.models.response.ApiResponse;
import com.rancard.ecommerce.utils.ApiUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;

@Slf4j
@Service
public class OrdersService {

    private final ApiUtils apiUtils;

    public OrdersService(ApiUtils apiUtils) {
        this.apiUtils = apiUtils;
    }


    public ApiResponse getOrders(String sessionId){
    long start = System.currentTimeMillis();
        log.info("["+sessionId+"] about to get orders");

        Order order = new Order();
        order.setOrderId("1");
        order.setCustomerId("Customer 1");
        order.setOrderDate(new Date());
        order.setOrderStatus(Order.OrderStatus.PENDING);
        order.setItem("Fufu");

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(Collections.singletonList(order));
        apiResponse.setRequestId(sessionId);
        apiResponse.setMessage("Success");
        apiResponse.setCode(200);
        apiResponse.setDuration(apiUtils.getApiDuration(start));

        return apiResponse;
    }

    public ApiResponse createOrder(OrderCreationRequest order, String sessionId) {
        log.info("["+sessionId+"] about to create order with details : "+ order.toString());
        return new ApiResponse();

    }
}
