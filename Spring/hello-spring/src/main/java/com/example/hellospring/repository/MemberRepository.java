/**
 * packageName  : com.example.hellospring.repository
 * fileName     : MemberRepository
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

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findById(Long id);

    Optional<Member> findByName(String name);

    List<Member> findAll();

}
