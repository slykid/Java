package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
