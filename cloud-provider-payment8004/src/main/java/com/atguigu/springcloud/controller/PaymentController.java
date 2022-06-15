package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description
 * @Author 无忧
 * @Date 2022/6/10 18:10
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/k")
    public String paymentzk(){
        return "spring cloud with zookeeper :" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
