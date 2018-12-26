package com.study.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController//如果每个功能返回的都是restful内容，那么可以使用该注解，可以省去responsebody注解
public class SpringController {
    @RequestMapping("/hello")
    //经常使用下面的注解，说明返回的restful内容，不使用会进行跳转
//    @ResponseBody
    public String show() {
        return "adfadfasd";
    }

    @RequestMapping("/ok")
    //多个使用它，在这个类上使用@restController
//    @ResponseBody
    public String getCon() {
        return "44444aaaaa12312asasdfadsfdasdasdads313123";
    }

    @RequestMapping("/info/{msg}")//这个msg要传给形参，需要加注解@PathVariable
    //http://localhost:8080/info/restful!!!---访问时传递个值
    //支持Rest风格
    public String fun(@PathVariable String msg) {
        return "haha" + msg;
    }
}
