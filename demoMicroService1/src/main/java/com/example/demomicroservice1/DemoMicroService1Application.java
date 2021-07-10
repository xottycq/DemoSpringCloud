package com.example.demomicroservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoMicroService1Application {

    @Bean
    @LoadBalanced//在注册中心里进行查找微服务,负载均衡
    public RestTemplate restTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        return  restTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroService1Application.class, args);
    }

}
