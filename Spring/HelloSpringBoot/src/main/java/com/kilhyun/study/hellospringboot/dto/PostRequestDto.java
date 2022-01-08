package com.kilhyun.study.hellospringboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {

    private String account;
    private String email;
    private String address;
    private String password;
    //private String phoneNumber;  // 변수를 표현하는 방식이 다른 경우에는(Request Body 에는 phone_number 로 전달하는 경우)???
                                 // PostRequestDto {
                                 //      account='user01',
                                 //      email='kid1064@gmail.com',
                                 //      address='경기도 김포시',
                                 //      password='1234',
                                 //      phoneNumber='null' -> 넘겨받은 변수가 서로 다르기 때문에 NULL 로 출력됨
                                 // }
    // 해결방법
    @JsonProperty("phone_number")  // 특정이름에 대한 매칭이 가능함  -> 잘 나오면 성공!!
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
