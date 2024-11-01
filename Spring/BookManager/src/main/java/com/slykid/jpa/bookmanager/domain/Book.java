package com.slykid.jpa.bookmanager.domain;

import com.slykid.jpa.bookmanager.domain.listener.Auditable;
import jakarta.persistence.*;
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
public class Book extends BaseEntity implements Auditable {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String author;

//    BaseEntiry 사용에 따른 주석처리
//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    @LastModifiedDate
//    private LocalDateTime updatedAt;

// EntityListener 클래스 생성에 따른 주석 처리
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
