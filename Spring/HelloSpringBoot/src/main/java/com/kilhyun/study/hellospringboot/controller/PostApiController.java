package com.kilhyun.study.hellospringboot.controller;

import com.kilhyun.study.hellospringboot.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // POST 방식은 기본적으로 @PostMapping 어노테이션을 통해서 데이터를 받음
    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {  // POST 방식일 때는 반드시 @RequestBody 형식으로 데이터를 받아야함
        requestData.forEach((key, value) -> {
            System.out.println("key: " + key);
            System.out.println("value: " + value);
        });
    }

    // DTO를 사용해서 Request Body를 받는 방법
    @PostMapping("/post-dto")
    public void postDto(@RequestBody PostRequestDto requestDto) {
        System.out.println(requestDto);
    }

}
