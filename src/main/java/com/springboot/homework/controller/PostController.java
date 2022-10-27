package com.springboot.homework.controller;

import com.springboot.homework.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/member1",method = RequestMethod.POST)
    public String postMember(@RequestBody Map<String,String> postData){
        StringBuilder sb = new StringBuilder();
        postData.entrySet().forEach(map->sb.append(map.getKey()+":"+map.getValue()+"\n"));
        return sb.toString();
    }

}
