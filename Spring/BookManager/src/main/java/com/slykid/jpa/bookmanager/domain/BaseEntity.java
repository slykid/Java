package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass  // 해당 클래스의 필드를 상속받는 엔티티의 컬럼으로 포함
@EntityListeners(value= AuditingEntityListener.class)
public class BaseEntity {

    /*
        아래 2개 필드과 같이 반복적으로 사용되는 필드, 어노테이션, 이벤트 등에 대해서 기본 엔티티 클래스를 만든 후,
        사용하는 객체에 해당 클래스를 상속받아서 필드 및 컬럼으로 사용하도록 하는 방식을 지향함
    */

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
