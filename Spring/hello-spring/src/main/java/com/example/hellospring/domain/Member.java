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

public class Member {
    private Long id;
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
