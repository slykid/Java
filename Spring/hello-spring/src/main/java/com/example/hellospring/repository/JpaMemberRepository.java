/**
 * packageName  : com.example.hellospring.repository
 * fileName     : JpaMemberRepository
 * author       : slykid
 * date         : 25. 1. 27.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 27.          slykid         최초작성
 */
package com.example.hellospring.repository;


import com.example.hellospring.domain.Member;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

    private EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);

    }

    @Override
    public Optional<Member> findByName(String name) {
       List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
               .setParameter("name", name)
               .getResultList();

        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        List<Member> result = em.createQuery("select m from Member m", Member.class).getResultList();

        return result;
    }
}
