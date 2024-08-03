package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<Users, Long> {

    // Query Method 생성

    // 1. findByName() 메소드 생성
    // Users findByName(String name);  // Test 시 에러 발생: Query did not return a unique result(중복 객체 확인)
    // List<Users> findByName(String name);

    // 2. Optional로 변경해보면? (중복 객체 관련에러가 발생하므로 1번째 println 문은 주석처리 필요!)
    // Optional<Users> findByName(String name);  // 정상적으로 잘 실행됨

    // 3. Set으로 변경해서 해보면?
    Set<Users> findByName(String name);

    // 4. UserRepository 클래스에서 지원해주는 다양한 Query Method들 확인
    Users findByEmail(String email);
    Users getByEmail(String email);
    Users readByEmail(String email);
    Users queryByEmail(String email);
    Users searchByEmail(String email);
    Users streamByEmail(String email);
    Users findUserByEmail(String email);
    Users findSomethingByEmail(String email);

    List<Users> findFirst1ByName(String name);
    List<Users> findTop1ByName(String name);

    List<Users> findFirst2ByName(String name);
    List<Users> findTop2ByName(String name);

    List<Users> findLast1ByName(String name);

    // And, Or 조건의 QueryMethod 구현
    List<Users> findByEmailAndName(String email, String name);
    List<Users> findByEmailOrName(String email, String name);

    // After, Before 키워드 (시간에 대한 조건)
    List<Users> findByCreatedAtAfter(LocalDateTime yesterday);
    List<Users> findByIdAfter(Long id);

    // GreaterThan, GreaterThanEqual, LessThan, LessThanEqual (수치 비교 조건)
    List<Users> findByCreatedAtGreaterThan(LocalDateTime yesterday);
    List<Users> findByCreatedAtGreaterThanEqual(LocalDateTime yesterday);

    List<Users> findByCreatedAtBetween(LocalDateTime yesterday, LocalDateTime today);
    List<Users> findByIdBetween(Long id1, Long id2);
    List<Users> findByIdGreaterThanEqualAndIdLessThanEqual(Long id1, Long id2);
}
