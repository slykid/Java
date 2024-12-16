package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper=true)  // BaseEntity 상속오류 현상해결을 위한 추가
@EqualsAndHashCode(callSuper=true)  // BaseEntity 상속오류 현상해결을 위한 추가
public class Book extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long authorId;
    private Long publisherId;

    private String category;

    @OneToOne
    private BookReviewInfo bookReviewInfo;

}
