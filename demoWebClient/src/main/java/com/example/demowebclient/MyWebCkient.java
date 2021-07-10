package com.example.demowebclient;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
public class MyWebCkient {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value="/ulogin",produces = "application/json;charset=UTF-8")
    public Map userlogin() {
        List<ServiceInstance> list = discoveryClient.getInstances("USERLOGIN");
        String serviceUrl = list.get(0).getUri().toString();

        System.out.println(serviceUrl);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(serviceUrl + "/login", Map.class);
    }
}

