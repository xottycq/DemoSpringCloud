package com.example.demomicroservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserLoginController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/login")
    public Map<String,String> reg()
    {
        String msg=restTemplate.getForEntity("http://userreg/reg",String.class).getBody();//userreg是调用注册中心里的名字
        Map<String,String> map=new HashMap<String, String>();
        map.put("loginstatus","用户登录成功");
        map.put("registerstatus",msg);
        return map;
    }
}
