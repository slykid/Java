package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class UserHistory extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private String name;

    private String email;

//    BaseEntity 사용에 따른 주석처리
//    @CreatedDate
//    private LocalDateTime createdAt;  // MyEntityListener 에서 Auditable 을 설정해주었기 때문에  implement Auditable 을 해주어야함
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;  // MyEntityListener 에서 Auditable 을 설정해주었기 때문에  implement Auditable 을 해주어야함

}
