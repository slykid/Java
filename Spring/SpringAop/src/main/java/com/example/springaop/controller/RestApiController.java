package com.example.springaop.controller;

import com.example.springaop.annotation.Decode;
import com.example.springaop.annotation.Timer;
import com.example.springaop.dto.User;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
//    public void get(@PathVariable Long id, @RequestParam String name) {
    public String get(@PathVariable Long id, @RequestParam String name) {
        System.out.println("GET Method is working");
        System.out.println("ID: " + id + ", Name: " + name);

        return id + " " + name;
    }

    @PostMapping("/post")
//    public void post(@RequestBody User user) {
    public User post(@RequestBody User user) {
        System.out.println("POST Method is working");
        System.out.println("User info: " + user);

        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {

        // DB Logic
        Thread.sleep(1000 * 2);

    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user) {
        System.out.println("PUT Method is working");
        System.out.println("User info: " + user);

        return user;
    }


}
