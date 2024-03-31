package com.java.kilhyun.OOP;

public class ex30_8_JoinTest {

    public static void main(String[] args)
    {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join();
        } catch (InterruptedException e) {}

        System.out.println("1 ~ 100 까지의 합: " + sumThread.getSum());
    }

}
