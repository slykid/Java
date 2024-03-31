package com.kilhyun.study.hellospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // Annotation 을 통해 REST Controller로 동작할 것임을 명시 -> 해당 클래스는 REST API 를 처리하는 Controller로 자동등록됨
@RequestMapping("/api")   // RequestMapping Annotation은 URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello")  // http://localhost:9090/api/hello
    public String hello() {
        return "Hello SpringBoot";
    }

}
