package com.example.springvalidationexample.controller;

import com.example.springvalidationexample.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @PostMapping("/user")
    //public User user(@Valid @RequestBody User user) {
    public ResponseEntity user(@Valid @RequestBody User user, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            bindingResult.getAllErrors().forEach(objectError -> {
                FieldError field = (FieldError) objectError;
                String message = objectError.getDefaultMessage();

                System.out.println("field : " + field.getField());
                System.out.println(message);

                sb.append("Field: " + field.getField());
                sb.append("Message: " + message);
            });

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
        }

        System.out.println(user);

        return ResponseEntity.ok(user);
    }
}
