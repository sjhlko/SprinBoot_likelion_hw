package com.springboot.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }
    @GetMapping("/name")
    public String getName(){
        return "heong";
    }
}
