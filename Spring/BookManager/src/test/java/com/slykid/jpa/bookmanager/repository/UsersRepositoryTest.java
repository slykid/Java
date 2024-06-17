package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void crud()
    {
        memberRepository.save(new Users());

        System.out.println(">>> " + memberRepository.findAll());
//        memberRepository.findAll().forEach(System.out::println);
    }

}