package com.rancard.ecommerce.utils;

import org.springframework.stereotype.Component;

@Component
public class ApiUtils {

    public long getApiDuration(long startTime) {
        return System.currentTimeMillis() - startTime;
    }
}

