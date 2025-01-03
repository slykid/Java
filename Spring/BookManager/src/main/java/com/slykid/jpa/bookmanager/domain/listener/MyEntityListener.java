package com.slykid.jpa.bookmanager.domain.listener;


import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

public class MyEntityListener {
    /*
        Listener 를 사용하는 이유
        - 반복적인 부분에 대한 코딩과 일괄 처리 및 휴먼에러 발생 감소를 위함
    */

    @PrePersist
    public void prePersist(Object obj) {
        if (obj instanceof Auditable) {
            ((Auditable) obj).setCreatedAt(LocalDateTime.now());
            ((Auditable) obj).setUpdatedAt(LocalDateTime.now());
        }
    }

    @PreUpdate
    public void preUpdate(Object obj) {
        ((Auditable) obj).setUpdatedAt(LocalDateTime.now());
    }
}
