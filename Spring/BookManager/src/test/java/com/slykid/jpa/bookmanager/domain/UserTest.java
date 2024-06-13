package com.slykid.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("slykid@naver.com");
        user.setName("slykid");

        System.out.println("User: " + user.getName() + " / Email: " + user.getEmail());
        System.out.println(user.toString());

        User user1 = new User(null,"slykid", "slykid@naver.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("slykid", "slykid@naver.com");

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }

}