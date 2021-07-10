package com.example.demowebclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoWebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebClientApplication.class, args);
    }

}
