package com.java.kilhyun.OOP;

public class ex30_4_ThreadSharedResourceTest {

    public static void main(String[] args)
    {
        CalculatorForThread calculator = new CalculatorForThread();
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();
    }

}
