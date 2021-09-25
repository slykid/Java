package com.java.kilhyun.OOP;

public class ex30_11_StopFlagTest {

    public static void main(String[] args)
    {
        PrintThread printThread = new PrintThread();
        printThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        printThread.setStopFlag(true);
    }
}
