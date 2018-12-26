package com.study.learn.controller;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.security.PrivateKey;

import static org.junit.Assert.*;
@SpringBootTest//测试谁@SpringBootTest(class=SpringController.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration//和web项目
public class SpringControllerTest {
    @Autowired
    private SpringController springController;
    @Test
    public void show() {
        TestCase.assertEquals(this.springController.show(),"hello");
    }
}