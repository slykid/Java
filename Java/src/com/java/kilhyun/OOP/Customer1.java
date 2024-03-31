package com.java.kilhyun.OOP;

public class Customer1 implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("Customer Buy");
    }

    @Override
    public void sell() {
        System.out.println("Customer Sell");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }


}
