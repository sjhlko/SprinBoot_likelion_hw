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
    @GetMapping("/request1")
    public String getVariable2(@RequestParam String name, @RequestParam String email,
                               @RequestParam String organization){
        return String.format("이름:%s 이메일:%s 기관:%s", name, email,organization);
    }

}
