package com.example.demomicroservice2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserRegisterController {

    @RequestMapping(value="/reg")
    public String reg()
    {
        return "用户已注册成功！";
    }
}
