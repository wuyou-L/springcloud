package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 支付模块启动类
 * @Author 无忧
 * @Date 2022/6/9 21:55
 */
@SpringBootApplication
@EnableEurekaClient
public class  PaymentMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class);
    }
}
