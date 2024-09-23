package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data // @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
@Builder // Builder 형식으로 객체 생성 + 필드값 주입을 수행함
@Entity  // 데이터베이스의 테이블과 연결하는 객체, 식별을 위한 ID가 필요함
@Table(name="users", indexes={ @Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
// @Table 어노테이션
// - 테이블의 이름, 카탈로그, 스키마 등을 지정할 수 있는 어노테이션
// - 일반적으로는 엔티티의 이름에 맞는 테이블명을 자동으로 지정하나, 이름, 스키마, 카탈로그를 지정해서 사용하는 경우도 있음 (ex. 기존 레거시DB를 사용하는 경우)
// - 추가적으로 제약조건과 인덱스를 위의 예시와 같이 추가할 수도 있다.
public class Users {
    @Id                    // 해당 변수를 @Entity 의 ID 값으로 사용
    @GeneratedValue      // 자동으로 ID 생성을 위한 설정
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // address 엔티티 클래스 생성 후 아래 코드 활성화
    @OneToMany(fetch=FetchType.EAGER)
    private List<Address> address;


}
