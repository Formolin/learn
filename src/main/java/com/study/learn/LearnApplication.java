package com.study.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.study.learn")//不同包下扫描别的controller，进行实例化
@SpringBootApplication(scanBasePackages = {"com.study.learn"})
public class LearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

}

