package com.study.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan("com.study.learn")//不同包下扫描别的controller，进行实例化
//@SpringBootApplication(scanBasePackages = {"com.study.learn"})//扫描controller、service
@SpringBootApplication()
//@EntityScan("com.study.learn.pojo")//扫描实体类
//@EnableJpaRepositories("com.study.learn.dao")//扫描dao
public class LearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnApplication.class, args);
    }

}

