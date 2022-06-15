package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 支付模块启动类
 * @Author 无忧
 * @Date 2022/6/9 21:55
 */
@SpringBootApplication
@EnableEurekaClient     // 开启 Eureka Client 服务消费者
@EnableDiscoveryClient  // 开启 Discovery 服务发现
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class);
    }
}
