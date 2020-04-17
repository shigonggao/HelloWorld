package com.sgg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 控制器类
@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello spring mvc");
        return "ok";
    }
}
