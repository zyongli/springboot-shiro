package com.lzy.shiro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/login")
    public String login() {
        return "登录成功";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
