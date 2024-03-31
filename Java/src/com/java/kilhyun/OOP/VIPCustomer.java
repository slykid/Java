package com.java.kilhyun.OOP;

public class VIPCustomer extends Customer {
    /*
        customerID: 고객 아이디
        customerName: 고객 이름
        customerGrade: 고객 등급 (기본등급 : SILVER)
        bonusPoint: 고객 보너스 포인트 (제품 구매 시 누적 적용됨)
        bonusRatio: 보너스 포인트 적립율(기본 1% 적용)

        상기 내용은 상속될 예정임

        salesRatio: 제품 구매시 할인율
        agentID: 담당 상담원 배정
     */
    double salesRatio;
    private int agentID;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

//        System.out.println("VIPCustomer() 생성자 호출");
    }

//    public VIPCustomer(int customerID, String customerName) {
//        super(0, "");
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer() 생성자 호출");
//    }

    // 메소드 오버라이딩
    @Override
    public int calcPrice(int price)
    {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

}
