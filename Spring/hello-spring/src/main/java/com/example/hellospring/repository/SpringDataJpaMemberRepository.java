/**
 * packageName  : com.example.hellospring.repository
 * fileName     : SpringDataJpaMemberRepository
 * author       : kilhyunkim
 * date         : 25. 1. 29.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 29.          kilhyunkim         최초작성
 */
package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // 스프링 데이터 JPA는 기본적으로 CRUD를 제공함
    // JPQL: select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
