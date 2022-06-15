package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author 无忧
 * @Date 2022/6/10 0:06
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // 注释，验证自写LB
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
