package com.java.kilhyun.OOP;

public class Member2 {

    private String name;
    private String id;

    public Member2() {
        System.out.println("실행");
    }

    public Member2(String id) {
        System.out.println("Member(String id) 생성자 실행");
        this.id = id;
    }

    public Member2(String name, String id) {
        System.out.println("Member(String name, String id) 생성자 실행");
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

}
