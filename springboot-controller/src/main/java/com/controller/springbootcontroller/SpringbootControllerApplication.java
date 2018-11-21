package com.controller.springbootcontroller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.**")
@MapperScan(basePackages = "com.mybatis.springbootmybatis.dao")
public class SpringbootControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootControllerApplication.class, args);
    }
}
