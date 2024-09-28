package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Gender;
import com.slykid.jpa.bookmanager.domain.Users;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import java.time.LocalDateTime;
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

        // 16. save() 메소드를 사용한 Update 쿼리 구현하기
        // - SimpleJpaRepository 클래스를 사용
        // - 해당 인터페이스에서 구현체를 제공하고 있음
        userRepository.save(new Users("david", "david@gmail.com"));

        Users user = userRepository.findById(203L).orElseThrow(RuntimeException::new);
        user.setEmail("jack-updated@gmail.com");

        userRepository.save(user);

        // 결과 확인
        userRepository.findAll().forEach(System.out::println);

    }

    @Test
    void select()
    {
        // System.out.println(userRepository.findByName("slykid"));  // Optional 타입변경 후 주석처리
        // 실행결과: 에러 발생 (Query did not return a unique result / 2건의 객체가 조회됨) -> List 형식으로 수정해 결과를 출력

        // System.out.println(userRepository.findByName("dennis")); // Optional 타입, Set 타입 변경 후 실행

        // System.out.println(userRepository.findByEmail("slykid@naver.com"));

        System.out.println("findByEmail: " + userRepository.findByEmail("slykid@naver.com"));
        System.out.println("getByEmail: " + userRepository.getByEmail("slykid@naver.com"));
        System.out.println("readByEmail: " + userRepository.readByEmail("slykid@naver.com"));
        System.out.println("queryByEmail: " + userRepository.queryByEmail("slykid@naver.com"));
        System.out.println("searchByEmail: " + userRepository.searchByEmail("slykid@naver.com"));
        System.out.println("streamByEmail: " + userRepository.streamByEmail("slykid@naver.com"));
        System.out.println("findUserByEmail: " + userRepository.findUserByEmail("slykid@naver.com"));

        // 해당 클래스 문자열이 구현체에서 무시됨을 확인 가능 / 그래도 가급적이면 네이밍은 맞춰주자!!!
        System.out.println("findSomethingByEmail: " + userRepository.findSomethingByEmail("slykid@naver.com"));

        // fetch ~ first ? rows only 사용 쿼리가 생성됨
        System.out.println("findTop1ByName: " + userRepository.findTop1ByName("slykid"));
        System.out.println("findFirst1ByName: " + userRepository.findFirst1ByName("slykid"));

        System.out.println("findTop2ByName: " + userRepository.findTop2ByName("slykid"));
        System.out.println("findFirst2ByName: " + userRepository.findFirst2ByName("slykid"));

        System.out.println("findLast1ByName: " + userRepository.findLast1ByName("slykid"));
        // -> 예상과 달리 위의 findTop2ByName 과 동일한 결과가 출력됨 / "Last"는 인식되는 키워드가 아니기 때문에 무시됨


        // And, Or 조건의 QueryMethod 구현
        System.out.println("findByEmailAndName: " + userRepository.findByEmailAndName("slykid@naver.com", "slykid"));
        System.out.println("findByEmailOrName: " + userRepository.findByEmailOrName("slykid@naver.com", "slykid"));

        // After, Before 키워드 (시간에 대한 조건)
        System.out.println("findByCreatedAtAfter: " + userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByIdAfter: " + userRepository.findByIdAfter(4L));

        // GreaterThan, GreaterThanEqual, LessThan, LessThanEqual (수치 비교 조건)
        System.out.println("findByCreatedAtGreaterThan: " + userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
        System.out.println("findByCreatedAtGreaterThanEqual: " + userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));

        System.out.println("findByCreatedAtBetween: " + userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now()));
        System.out.println("findByIdBetween: " + userRepository.findByIdBetween(1L, 3L));
        System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual:" + userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L, 3L));

        // 빈 값에 대한 조회
        System.out.println("findByIdIsNotNull: " + userRepository.findByIdIsNotNull());

        // 아래 코드는 에러를 발생함: IsEmpty / IsNotEmpty can only be used on collection properties
        // isEmpty / isNotEmpty 는 컬렉션 타입에서만 사용가능함
        // + String 에서는 빈 문자열을 "Empty" 로 표시하며, 공백 및 NULL 모두 해당되기 때문에 사용에 유의하자.
        // System.out.println("findByIdIsNotEmpty: " + userRepository.findByIdIsNotEmpty());
        // System.out.println("findByAddressIsNotEmpty: " + userRepository.findByAddressIsNotEmpty());

        // 값의 포함여부 확인
        System.out.println("findByNameIn: " + userRepository.findByNameIn(Lists.newArrayList("martin", "deniss")));

        // 특정 값의 포함여부 확인
        System.out.println("findByNameStartingWith: " + userRepository.findByNameStartingWith("sly"));
        System.out.println("findByNameEndingWith: " + userRepository.findByNameEndingWith("kid"));
        System.out.println("findByNameContains: " + userRepository.findByNameContains("lyk"));

        // findByNameLike() 구문과 비교하기
        System.out.println("findByNameLike: " + userRepository.findByNameLike("%lyk%"));
    }

    @Test
    void pagingAndSortingTest()
    {
        System.out.println("findTop1ByNameOrderByIdDesc: " + userRepository.findTop1ByNameOrderByIdDesc("slykid"));
        // System.out.println("findTopByNameOrderByIdDesc: " + userRepository.findTopByNameOrderByIdDesc("slykid"));
        // 위의 결과와 동일 -> N 값이 별도로 명시되지 않으면 기본적으로 1로 설정됨

        System.out.println("findFirstByNameOrderByIdDescEmailAsc: " + userRepository.findFirstByNameOrderByIdDescEmailAsc("slykid"));

        // 주의: data.domain.sort 내의 함수를 사용함!
        System.out.println("findFirstByName: " + userRepository.findFirstByName("slykid", Sort.by(Sort.Order.desc("id"))));
        System.out.println("findFirstByName: " + userRepository.findFirstByName("slykid", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));

        // Paging 을 이용한 다수의 값 조회하기
        System.out.println("findByNameWithPaging: " + userRepository.findByName("slykid", PageRequest.of(0, 1, Sort.by(Sort.Order.desc("id")))));

        // 값을 조회하려는 경우 getContent() 메소드를 사용하여 조회
        System.out.println("findByNameWithPaging: " + userRepository.findByName("slykid", PageRequest.of(0, 1, Sort.by(Sort.Order.desc("id")))).getContent());
        System.out.println("findByNameWithPaging: " + userRepository.findByName("slykid", PageRequest.of(1, 1, Sort.by(Sort.Order.desc("id")))).getContent());

        // 페이지 수를 알고 싶은 경우에는 getTotalElements() 메소드를 사용해 페이지 수를 확인할 수 있음
        System.out.println("findByNameWithPaging: " + userRepository.findByName("slykid", PageRequest.of(0, 1, Sort.by(Sort.Order.desc("id")))).getTotalElements());
    }

    @Test
    void insertAndUpdateTest() {
        Users user = new Users();
        user.setName("saint-martin");
        user.setEmail("saintmartin@naver.com");

        userRepository.save(user);

        Users user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("SLYK1D");
        userRepository.save(user2);
    }

    @Test
    void enumTest(){
        Users user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);
        System.out.println(userRepository.findRawRecord().get("gender"));  // 변경전: 값이 0이 출력됨, 변경후: MALE 로 출력됨
    }

}