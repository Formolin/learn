package com.study.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
    @RequestMapping("/hello")
    @ResponseBody
    public String show(){
        return "hello";
    }
}
