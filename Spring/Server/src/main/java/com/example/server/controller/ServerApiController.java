package com.example.server.controller;

import com.example.server.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("/hello")
//    public String hello() {
    public User hello(@RequestParam String name, @RequestParam int age) {

        User user = new User();

//        user.setName("slykid");
//        user.setAge(30);

        user.setName(name);
        user.setAge(age);

//        return "hello server!";
        return user;
    }

    @PostMapping("/user/{userId}/name/{userName}")
    public User post(@RequestBody User user, @PathVariable int userId, @PathVariable String userName) {
        log.info("User ID: {}, User Name: {}", userId, userName);
        log.info("Client Request : {}", user);

        return user;

    }

    @PostMapping("/userexchange/{userId}/name/{userName}")
    public User exchange(@RequestBody User user,
                     @PathVariable int userId,
                     @PathVariable String userName,
                     @RequestHeader("x-authorization") String authorization,
                     @RequestHeader("custom-header") String customHeader
    ) {
        log.info("User ID: {}, User Name: {}", userId, userName);
        log.info("authorization: {}, custom: {}", authorization, customHeader);
        log.info("Client Request : {}", user);

        return user;

    }

}
