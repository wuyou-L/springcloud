package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 无忧
 * @Date 2022/6/13 13:07
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentFallbackService fallback paymentInfo_ok";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "PaymentFallbackService fallback paymentInfo_Timeout";
    }
}
