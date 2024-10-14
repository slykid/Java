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
//@Table(name="users", indexes={ @Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
// @Table 어노테이션
// - 테이블의 이름, 카탈로그, 스키마 등을 지정할 수 있는 어노테이션
// - 일반적으로는 엔티티의 이름에 맞는 테이블명을 자동으로 지정하나, 이름, 스키마, 카탈로그를 지정해서 사용하는 경우도 있음 (ex. 기존 레거시DB를 사용하는 경우)
// - 추가적으로 제약조건과 인덱스를 위의 예시와 같이 추가할 수도 있으나, 일반적으로는 제약사항과 인덱스의 설정은 DB에서 설정하는 경우가 많다.
@EntityListeners(value = MyEntityListener.class)
public class Users implements Auditable {
    @Id                  // 해당 변수를 @Entity 의 ID 값으로 사용
    @GeneratedValue      // 자동으로 ID 생성을 위한 설정
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    // @Enumerated // (변경 전)
    // enum의 순서 상 첫번째가 MALE 로 되어있다면 0으로, 두번째로 되어있다면 1로 매핑되어 값이 들어감
    // (@Enumerated 어노테이션 설정 상 ORDINAL 로 기본 설정이 되어있기 때문)
    // JPA 에서 출력할 때는 자동으로 변환되어 MALE 로 나오는 것!
    // ※ 문제가 되는 상황: 리펙토링을 통해 enum에 추가적인 값이 설정되는 ORDINAL 옵션에 의해 순서값이 변경될 우려가 있음
    // → 위의 문제를 해결하기 위해 아래와 같이 어노테이션 내 value 필드 값을 STRING 으로 설정해주는 것이 필수!
    @Enumerated(value=EnumType.STRING) // (변경 후)
    private Gender gender;

    // @Column(name="crtd_dt")
    /*
    @Column 어노테이션
    - 애플리케이션에서 사용할 컬럼명과 DB에서의 컬럼명이 상이한 경우, 매핑을 하기 위한 용도로 사용
      @Column 어노테이션의 name 필드에 선언된 DB 컬럼명을 아래 변수에 매핑하겠다는 의미
    - DB는 유지하면서 애플리케이션만 업데이트를 하는 경우에 주로 사용됨
      ex. DB의 컬럼명이 crtd_dt라고 할 경우, ORM에 의해 코드에서 엔티티를 가져올 때 getCrtd_dt() 라는 식의 코드를 작성할 수 밖에 없음
    - 만약 null 값에 대한 설정을 한다면, nullable 필드에 설정하면 되고, 기본적으로 True 로 설정되어 있기 때문에,
      NotNull 인 경우에만 false 로 설정하면 된다.
    - unique contraints를 컬럼 1개에만 설정하려는 경우에 unique 필드에 True로 설정하여 추가할 수 있다.
    - 만약 아래 변수가 insert 혹은 update 시에 반영되지 않기를 원한다면, insertable, updatable 필드 값을 False로 설정하면 된다.
    */
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @Transient
    /*
    @Transient 어노테이션
    - 영속성 처리에서 제외하여 DB 데이터에 반영되지 않고, 오브젝트와 생애주기를 같이하는 설정
    - 아래 필드가 DDL과 상관없이 순수하게 오브젝트의 속성으로 사용하고 싶은 경우에 활용됨
    */
    private String testData;

    // address 엔티티 클래스 생성 후 아래 코드 활성화
    // @OneToMany(fetch=FetchType.EAGER)
    //private List<Address> address;

    // Entity Listener (로그 찍는 용도이며, listenerTest 실행이외는 주석 처리)
//    @PrePersist
//    public void prePersist() {
//        System.out.println(">>> PrePersist");
//    }
//
//    @PostPersist
//    public void postPersist() {
//        System.out.println(">>> PostPersist");
//    }
//
//    @PreUpdate
//    public void preUpdate() {
//        System.out.println(">>> PreUpdate");
//    }
//
//    @PostUpdate
//    public void postUpdate() {
//        System.out.println(">>> PostUpdate");
//    }
//
//    @PreRemove
//    public void preRemove() {
//        System.out.println(">>> PreRemove");
//    }
//
//    @PostRemove
//    public void postRemove() {
//        System.out.println(">>> PostRemove");
//    }
//
//    @PostLoad
//    public void postLoad() {
//        System.out.println(">>> PostLoad");
//    }

// EntityListener 클래스 생성에 따른 주석처리
//    @PrePersist
//    public void prePersist() {
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//    }
//
//    @PreUpdate
//    public void preUpdate() {
//        this.updatedAt = LocalDateTime.now();
//    }
}
