package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
