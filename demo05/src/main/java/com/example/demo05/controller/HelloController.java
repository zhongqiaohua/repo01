package com.example.demo05.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public  String hello(){

        return "Hello";
    }

    //这里准备来个新的Controller
    //修改源码了
}
