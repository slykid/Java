/**
 * packageName  : com.example.hellospring.service
 * fileName     : MemberService
 * author       : slykid
 * date         : 25. 1. 8.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 8.          slykid         최초작성
 */
package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemoryMemberRepository;

import java.util.Optional;


public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원 가입
     * - 같은 이름의 중복 회원은 제
     */
    public Long join(Member member) {
        Optional<Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });

        memberRepository.save(member);

        return member.getId();
    }

}
