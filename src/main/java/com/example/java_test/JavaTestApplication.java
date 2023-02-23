package com.example.java_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.java_test.com.example.mapper")
public class JavaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTestApplication.class, args);
    }

}
