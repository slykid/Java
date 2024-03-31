package com.java.kilhyun.OOP;

public class Customer {
    /*
        customerID: 고객 아이디
        customerName: 고객 이름
        customerGrade: 고객 등급 (기본등급 : SILVER)
        bonusPoint: 고객 보너스 포인트 (제품 구매 시 누적 적용됨)
        bonusRatio: 보너스 포인트 적립율(기본 1% 적용)
     */

    private int customerID;
    protected String customerName;
    protected String customerGrade; // private 인 경우 해당 클래스 내에서만 사용가능하지만,
    // 상속받는 클래스까지 사용가능하도록 하기 위해 접근제한을 protected 로 설정

    int bonusPoint;
    double bonusRatio;

    // 생성자
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;

//        System.out.println("Customer() 생성자 호출");
    }

//    public Customer(int customerID, String customerName) {
//        this.customerID = customerID;
//        this.customerName = customerName;
//
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer() 생성자 호출");
//    }

    // 보너스 포인트 계산
    public int calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        return price;
    }

    // 사용자 정보출력
    public String showCustomerInfo()
    {
        return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
    }

    // Getter
    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    // Setter
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

}