package com.example.java_test.com.example.controller;

import com.example.java_test.com.example.entity.User;
import com.example.java_test.com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List query(){
        List<User> list = userMapper.find();
        System.out.println(list);
        return list;
    }
}
