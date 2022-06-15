package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author 无忧
 * @Date 2022/6/10 14:26
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002 {

    public static void main(String[] args) {
        SpringApplication.run(Eureka7002.class);
    }
}
