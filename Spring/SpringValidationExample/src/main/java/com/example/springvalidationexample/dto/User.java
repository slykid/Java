package com.example.springvalidationexample.dto;

import com.example.springvalidationexample.annotation.YearMonth;

import com.example.springvalidationexample.dto.Car;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {

    @NotBlank
    private String name;

    @Min(0)
    private int age;

    @Email
    private String email;

    @Pattern(regexp="^[0-9]{3}-[0-9]{3,4}-[0-9]{4}$", message="전화번호 형식이 아닙니다.")
    private String phoneNumber;

    @Size(min=6, max=8)   // 길이는 만족할 수 있지만, 111111 과 같이 yyyymm 이 아닌 형식에도 통과할 수 있음
    @YearMonth
    private String requestDate;  // 형식: yyyymm

    @Valid    // Car 클래스에 Validation 이 추가되어있다고 한들, 해당 클래스를 참조하는 변수에 @Valid 를 추가하지 않으면 검사하지 않음
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

//    YearMonthValidator 생성으로 인한 주석처리 (@YearMonth 어노테이션 설정이 안된 경우 주석해제)
//    @AssertTrue(message = "YYYYMM 형식에 맞지 않습니다.")
//    public boolean isRequestDateValidation() {
//
//        // 앞서 길이 검증으로 인해 발생할 수 있는 에러에 대한 별도 검증 로직 구현
//        try {
//            LocalDate localDate = LocalDate.parse(getRequestDate() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//
//        return true;
//    }


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", requestDate='" + requestDate + '\'' +
                ", cars=" + cars +
                '}';
    }
}
