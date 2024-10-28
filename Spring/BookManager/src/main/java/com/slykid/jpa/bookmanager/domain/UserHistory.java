package com.slykid.jpa.bookmanager.domain;

import com.slykid.jpa.bookmanager.domain.listener.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper=true)  // BaseEntity 상속오류 현상해결을 위한 추가
@EqualsAndHashCode(callSuper=true)  // BaseEntity 상속오류 현상해결을 위한 추가
//@EntityListeners(value = AuditingEntityListener.class)  // BaseEntity 사용에 따른 주석처리
public class UserHistory extends BaseEntity implements Auditable {
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
