package com.kilhyun.study.hellospringboot.controller;

import com.kilhyun.study.hellospringboot.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public UserDto user() {
        // Java 11 버전부터 사용 가능
        var user = new UserDto();

        user.setName("slykid");
        user.setAddress("서울 영등포구");

        return user;
    }

}
