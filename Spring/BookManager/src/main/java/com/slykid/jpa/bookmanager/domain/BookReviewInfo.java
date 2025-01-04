package com.slykid.jpa.bookmanager.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BookReviewInfo extends BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    // private Long bookId;
    @OneToOne(optional = false, mappedBy = "bookReviewInfo")
    // "optional = false" : Book 엔티티는 NULL 로 존재하지 않도록 설정
    // mappedBy = "bookReviewInfo" : 연관 키를 해당 테이블에서 가지지 않도록 설정,
    //                               순환 참조가 걸리는 엔티티(ex. @ToString 사용 엔티티) 에서는 사용 자제
    //                               (-> StackOverflowException 발생)
    private Book book;

    // Primitive Type vs. Wrappered Type 사용의 차이: NULL의 허용 유무
    // - NULL 허용: Wrappered Type 사용 (NULL check 하지 않을 경우 NullPointException 발생 가능), 그 외: Primitive Type 사용
    private float averageReviewScore;
    private int reviewCount;
}
