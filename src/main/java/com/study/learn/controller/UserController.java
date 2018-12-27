package com.study.learn.controller;

import com.study.learn.pojo.User;
import com.study.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/add")
    public String add(){
        User user = new User();
        user.setName("admin");
        user.setPassword("123");
        userService.addUser(user);
        return "success";
    }

    @ResponseBody
    @RequestMapping("/find/{id}")
    public User find(@PathVariable Integer id){

        return userService.findUser(id);
    }
}
