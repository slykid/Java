package com.slykid.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class MemberTest {
    @Test
    void test() {
        Member member = new Member();
        member.setEmail("slykid@naver.com");
        member.setName("slykid");

        System.out.println("User: " + member.getName() + " / Email: " + member.getEmail());
        System.out.println(member.toString());

        Member member1 = new Member(null,"slykid", "slykid@naver.com", LocalDateTime.now(), LocalDateTime.now());
        Member member2 = new Member("slykid", "slykid@naver.com");

        System.out.println(member1.toString());
        System.out.println(member2.toString());
    }

}