package com.example.springfilterexample.controller;

import com.example.springfilterexample.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j                                          // lombok 활용 시, Spring Application 상의 로그로 내용을 출력함
@RestController
@RequestMapping("/api/user")
public class ApiController {

    @PostMapping("")
    public User user(@RequestBody User user) {
        log.info("User: {}", user);
        return user;
    }

}
