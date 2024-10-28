package com.slykid.jpa.bookmanager.domain.listener;

import com.slykid.jpa.bookmanager.domain.UserHistory;
import com.slykid.jpa.bookmanager.domain.Users;
import com.slykid.jpa.bookmanager.repository.UserHistoryRepository;
import com.slykid.jpa.bookmanager.support.BeanUtils;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

//@Component  // BeanUtils 생성 후 주석처리
public class UserEntityListener {

//    BeanUtils 생성 후 주석처리
//    @Autowired
//    private UserHistoryRepository userHistoryRepository;  // 필드 인젝션 방식은 권장하지 않음
    @PrePersist
    @PreUpdate
    public void prePersistAndPreUpdate(Object entity) {
        // BeanUtils 생성 후 주석해제, 그 전까지는 주석으로 봉인
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        Users user = (Users) entity;

        UserHistory userHistory = new UserHistory();
        userHistory.setUserId(user.getId());
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());

        userHistoryRepository.save(userHistory);
    }

}
