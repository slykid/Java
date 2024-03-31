package com.java.kilhyun.OOP;

public class ex12_CastingTest {

    public static void main(String[] args)
    {
        // Upcasting
        Customer customer2 = new VIPCustomer();

        // VIP고객 정보 설정
        customer2.setCustomerID(10020);
        customer2.setCustomerName("김유신");
        customer2.bonusPoint=10000;

        // 고객 정보 출력
        System.out.println(customer2.showCustomerInfo());

        System.out.println("===============================================\n");

        //Downcasting
        Customer vc = new VIPCustomer();
        VIPCustomer vCustomer = (VIPCustomer)vc;


    }

}
