package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Users;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class UsersRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud()
    {
        // 1. UserRepository 에 저장된 데이터 출력하기
        userRepository.save(new Users());
        // System.out.println(">>> " + userRepository.findAll());
        userRepository.findAll().forEach(System.out::println);


        // 2. 저장된 데이터 정렬해서 불러오기
        List<Users> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        users.forEach(System.out::println);


        // 3. ID 값으로 특정 값만 조회하기
        List<Users> users1 = userRepository.findAllById(Lists.newArrayList(1L, 3L, 5L));
        users1.forEach(System.out::println);


        // 4. Users 객체 추가해서 출력하기
        Users user1 = new Users("Jack", "jack@fastcampus.com");
        Users user2 = new Users("Steve", "steve@fastcampus.com");

        userRepository.saveAll(Lists.newArrayList(user1, user2));
        List<Users> users2 = userRepository.findAll();

        users2.forEach(System.out::println);

        // 5.getOne 메소드 테스트
        Users user3 = userRepository.getOne(1L);
        System.out.println(user3);
        // 그냥 실행하면 생성된 Session 이 없기 때문에 "no Session" 이라는 에러 문구가 출력됨
        // 해결방안: 클래스에 @Transactional 어노테이션 추가


        // 6. @Transactional 어노테이션 없이 findById() 메소드 실행
        // Users user4 = userRepository.findById(1L);  // Syntax Error 발생 (findById 의 반환값이 Optional 이기 때문
        Optional<Users> user4 = userRepository.findById(1L); // 별도의 처리 필요
        System.out.println(user4);

        // 만약 1번과 같이 Users 클래스를 사용해 객체를 생성하려면 다음과 같이 작성하면 됨
        Users user5 = userRepository.findById(1L).orElse(null);
        System.out.println(user5);


        // 7. flush vs. saveAndFlush
        // - 로그상으로는 확인할 수 없음
        userRepository.save(new Users("new slykid", "newslykid@naver.com"));
        userRepository.flush();
        userRepository.findAll().forEach(System.out::println);

        userRepository.saveAndFlush(new Users("new slykid", "newslykid@fastcampus.com"));
        userRepository.findAll().forEach(System.out::println);
    }

}