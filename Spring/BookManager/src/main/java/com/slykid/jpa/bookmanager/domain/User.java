package com.slykid.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@Data // @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder // Builder 형식으로 객체 생성 + 필드값 주입을 수행함
public class User {
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
