package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author 无忧
 * @Date 2022/6/9 22:29
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);

        log.info("*********插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功" + servverPort, result);
        }else {
            return new CommonResult(444, "插入数据失败" + servverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        int i = 0;
        int j = 1;
        log.info("*********查询成功:" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功" + servverPort, payment);
        }else {
            return new CommonResult(444, "没有对应记录,id:" + id, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getParymentLB(){
        return servverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return servverPort;
    }
}
