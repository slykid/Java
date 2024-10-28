package com.slykid.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class UsersTest {
    @Test
    void test() {
        Users users = new Users();
        users.setEmail("slykid@naver.com");
        users.setName("slykid");

        System.out.println("User: " + users.getName() + " / Email: " + users.getEmail());
        System.out.println(users.toString());

//        Users users1 = new Users(null,"slykid", "slykid@naver.com", Gender.MALE, LocalDateTime.now(), LocalDateTime.now(), null);
        Users users2 = new Users("slykid", "slykid@naver.com");

//        System.out.println(users1.toString());
        System.out.println(users2.toString());
    }

}