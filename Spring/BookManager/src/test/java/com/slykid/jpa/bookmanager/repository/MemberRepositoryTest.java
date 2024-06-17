package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void crud()
    {
        memberRepository.save(new Member());

        System.out.println(">>> " + memberRepository.findAll());
    }

}