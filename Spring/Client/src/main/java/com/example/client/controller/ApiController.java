package com.example.client.controller;

import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ApiController {

    // 옛날 방식
    // @Autowired
    // private RestTemplateService restTemplateService;

    // 최근에는 생성자 주입방식으로 많이 사용함
    // 이 외에도 Lombok 을 활용하는 방법이 있음
    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/hello")
//    public String getHello() {
    public UserResponse getHello(@RequestParam String name, @RequestParam int age) {
        return restTemplateService.hello(name, age);
    }

    @PostMapping("/user")
    public UserResponse postHello() {
        return restTemplateService.post();
    }

    @PostMapping("/userexchange")
    public UserResponse exchangeHello() {
        return restTemplateService.exchange();
    }

}
