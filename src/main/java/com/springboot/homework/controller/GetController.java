package com.springboot.homework.controller;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/variable1/{variable}")
    public String getVariable(@PathVariable String variable){
        return "변수로 전달된 값은: "+ variable;
    }
}
