package com.example.java_test.com.example.controller;

import com.example.java_test.com.example.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("nickname") String name, String phone) {
        return "Hello " + name + ", Ph:" + phone;
    }


    @RequestMapping("/post4")
    public String post4(@RequestBody User user) {
        System.out.println(user);
        return "Post4";
    }

    @RequestMapping("/test/**")
    public String test(){
        return "test";
    }
}
