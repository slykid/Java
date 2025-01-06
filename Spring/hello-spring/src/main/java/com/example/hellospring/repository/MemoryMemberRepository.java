/**
 * packageName  : com.example.hellospring.repository
 * fileName     : MemoryMemberRepository
 * author       : kilhyunkim
 * date         : 25. 1. 2.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 2.          kilhyunkim         최초작성
 */
package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();  // 동시성 문제가 있지만, 간단한 예제이므로 사용
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {

        member.setId(++sequence);
        store.put(member.getId(), member);

        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {

        return Optional.ofNullable(store.get(id));  // NULL 인 경우에, 별도 처리하여 반환

    }

    @Override
    public Optional<Member> findByName(String name) {

       return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();

    }

    @Override
    public List<Member> findAll() {

        return new ArrayList<>(store.values());

    }
}
