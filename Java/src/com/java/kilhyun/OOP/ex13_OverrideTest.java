package com.java.kilhyun.OOP;

public class ex13_OverrideTest {

    public static void main(String[] args)
    {
        // 일반고객 정보 설정
        Customer customer1 = new Customer();
        customer1.setCustomerID(10010);
        customer1.setCustomerName("이순신");
        customer1.bonusPoint=1000;

        // VIP고객 정보 설정
        VIPCustomer customer2 = new VIPCustomer();
        customer2.setCustomerID(10020);
        customer2.setCustomerName("김유신");
        customer2.bonusPoint=10000;

        int price1 = customer1.calcPrice(10000);
        int price2 = customer2.calcPrice(10000);

        // 고객 정보 출력
        System.out.println(customer1.showCustomerInfo() + " 지불금액은 " + price1 + "원 입니다.");
        System.out.println(customer2.showCustomerInfo() + " 지불금액은 " + price2 + "원 입니다.");

    }

}
