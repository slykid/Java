package com.slykid.jpa.bookmanager.domain;

import com.slykid.jpa.bookmanager.domain.listener.UserEntityListener;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
@EntityListeners(value = { UserEntityListener.class })
@ToString(callSuper=true)
@EqualsAndHashCode(callSuper=true)
public class Users extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @Enumerated(value=EnumType.STRING) // (변경 후)
    private Gender gender;

    @OneToMany
    private List<UserHistory> userHistories = new ArrayList<>();

}
