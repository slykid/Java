/**
 * packageName  : com.example.hellospring.domain
 * fileName     : Member
 * author       : kilhyunkim
 * date         : 25. 1. 2.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 2.          kilhyunkim         최초작성
 */
package com.example.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name") // 변수명이 DB 컬럼명과 동일한 경우는 제외가능
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
