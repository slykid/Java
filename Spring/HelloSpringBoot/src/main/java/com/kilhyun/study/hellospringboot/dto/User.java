package com.kilhyun.study.hellospringboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public User() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 실수 하는 부분 (정상실행을 하려는 경우 아래 명명 코드는 주석처리 후 실행)
    //public User getDefaultUser() {
    public User defaultUser() {
        return new User("", 1, "010-0000-0000");
    }


    @Override
    public String toString() {
        return "User{name='" + name + "\', age=" + age + ", phoneNumber=" + phoneNumber + "}";
    }
}
