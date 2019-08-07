package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Zane
 * @Date: 2019/8/7 16:58
 * @Version: 1.0
 */
@RestController
public class Person {

    @GetMapping("personName")
    public String personName(){
        return "你是个贱人！";
    }
}
