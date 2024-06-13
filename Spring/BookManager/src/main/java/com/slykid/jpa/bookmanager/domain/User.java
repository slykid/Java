package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Data // @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder // Builder 형식으로 객체 생성 + 필드값 주입을 수행함
@Entity  // 선언 시, 식별할 수 있는 객체가 필요함
public class User {
    @Id  // @Entity 어노테이션 선언 시, 해당 멤버변수를 Entity의 ID로 사용하겠다는 의미
    @GeneratedValue  // 자동으로 값을 증가시켜주기위한 조치
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
