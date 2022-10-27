package com.springboot.homework.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping("/request2")
    public String getVariable3(@RequestParam Map<String, String> param){
        param.entrySet().forEach((map)->{
            System.out.printf("key: %s value: %s\n", map.getKey(),map.getValue());
        });
        return "호출 성공";
    }

}
