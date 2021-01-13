package com.java.kilhyun.OOP;

public class ex18_4_InterfaceTest {

    public static void main(String[] args)
    {
        Customer1 customer = new Customer1();

        customer.buy();
        customer.sell();
        customer.order();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();  // Buy 인터페이스의 order() 메소드가 호출

        Sell seller = customer;
        seller.sell();
        seller.order(); // Sell 인터페이스의 order() 메소드가 호출

    }


}
