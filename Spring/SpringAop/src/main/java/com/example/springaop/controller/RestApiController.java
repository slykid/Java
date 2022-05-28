package com.example.springaop.controller;

import com.example.springaop.dto.User;
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

}
