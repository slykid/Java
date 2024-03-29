package com.kilhyun.study.hellospringboot.controller;

import com.kilhyun.study.hellospringboot.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResponseTestController {

    // TEXT (사용할 일 거의 없음)
    @GetMapping("/return_text")
    public String returnText(@RequestParam String account) {
        return account;
    }


    // JSON
    // request - Object Mapper - Object - Method - Object - Object Mapper - json - response
    @PostMapping("/return_json")
    public UserDto returnJson(@RequestBody UserDto user) {
        return user;
    }

    @PutMapping("/put_json")
    public ResponseEntity<UserDto> put(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

}
