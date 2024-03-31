package com.java.kilhyun.OOP;

public class ex12_inheritanceTest {
    /*
    문제 : 고객별 등금에 따른 차별화된 서비스를 제공하는 고객 관리 프로그램 구현하기
    - 고객 등급에 따라 할인율, 적립금을 다르게 적용함
    - 등급
      SILVER (할인율=0%, 적립율=1%)
      VIP (할인율=10%, 적립율=5% / 담당 상담원 배정)

    - 테스트 시나리오
    일반고객 1명과 VIP 고객 1명이 존재할 때, 두 고객에 대한 객체를 생성하고 이에 대한 고객 정보를 출력하시오

    [일반고객 정보]
    - 이름 이순신
    - 아이디 10010
    - 보너스포인트 1000점

    [VIP고객 정보]
    - 이름 김유신
    - 아이디 10020
    - 보너스포인트 10000점

 */
    public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        VIPCustomer customer2 = new VIPCustomer();

        // 일반고객 정보 설정
        customer1.setCustomerID(10010);
        customer1.setCustomerName("이순신");
        customer1.bonusPoint=1000;

        // VIP고객 정보 설정
        customer2.setCustomerID(10020);
        customer2.setCustomerName("김유신");
        customer2.bonusPoint=10000;

        // 고객 정보 출력
        System.out.println(customer1.showCustomerInfo());
        System.out.println(customer2.showCustomerInfo());

    }

}

