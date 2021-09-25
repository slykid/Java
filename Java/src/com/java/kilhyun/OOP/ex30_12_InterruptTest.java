package com.java.kilhyun.OOP;

public class ex30_12_InterruptTest {

    public static void main(String[] args)
    {
        Thread thread = new PrintThread2();
        thread.start();

        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        thread.interrupt();
    }

}
