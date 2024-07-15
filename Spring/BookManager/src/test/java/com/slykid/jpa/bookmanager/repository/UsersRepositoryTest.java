package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Users;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

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
        Users user3 = userRepository.getOne(1L);  // getOne(): lazy fetch 를 진행
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
        // - Query 변경과 관련된 메소드가 아닌, DB 반영시점을 조절하는 메소드임
        userRepository.save(new Users("new slykid", "newslykid@naver.com"));
        userRepository.flush();
        userRepository.findAll().forEach(System.out::println);

        // save() + flush() = saveAndFlush()
        userRepository.saveAndFlush(new Users("new slykid", "newslykid@fastcampus.com"));
        userRepository.findAll().forEach(System.out::println);

        // 8. Count
        long count = userRepository.count();
        System.out.println(count);

        // 9. existsById
        // - count 쿼리가 조회됨 -> 기본적으로 count 쿼리를 실행하도록 설정되어있음
        boolean exists = userRepository.existsById(1L);
        System.out.println(exists);

        // 10. delete
        // - Entity 가 갖고 있는 ID 값으로 삭제가 이뤄짐
        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));

        // 11. deleteById
        // - delete 하기 전 해당 엔티티가 존재하는 지 확인을 하기 위한 select 쿼리 추가
        userRepository.deleteById(2L);
        userRepository.findAll().forEach(System.out::println);

        // 12. deleteAll
        // - 실제로는 1번이 존재하는 지 select, 3번이 존재하는 지 select 후에 1번, 3번 순으로 delete 를 수행
        // - 매개변수로 전달해주면 해당하는 엔티티만 삭제 가능
        // - findAll 과 동일하게 성능이슈가 발생함 (findAll -> for문을 사용하므로)
        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
        userRepository.findAll().forEach(System.out::println);

        // 13. deleteInBatch, deleteAllInBatch
        // - 한 번에 삭제 (별도 예제는 없음)

        // 14.Paging & getTotalElements
        Page<Users> usersPage = userRepository.findAll(PageRequest.of(1, 3));

        System.out.println("Page: " + usersPage);
        System.out.println("Total Elements: " + usersPage.getTotalElements());
        System.out.println("Total Pages: " + usersPage.getTotalPages());
        System.out.println("Number of elements: " + usersPage.getNumberOfElements());
        System.out.println("Sort: " + usersPage.getSort());
        System.out.println("Size: " + usersPage.getSize());

        usersPage.getContent().forEach(System.out::println);

        // 15. QBE(Query By Example)
        // - Example 자체가 Matcher 에 대한 일부 제약이 있어 사용하기 애매함
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")
                .withMatcher("email", endsWith());

        Example<Users> example = Example.of(new Users("ma", "fastcampus.com"), matcher);
        userRepository.findAll(example).forEach(System.out::println);
    }

}