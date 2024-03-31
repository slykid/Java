package com.java.kilhyun.OOP;

public class ex30_9_WaitNotifyTest {

    public static void main(String[] args)
    {
        SharedObject sharedObject = new SharedObject();

        Thread1 threadA = new Thread1(sharedObject);
        Thread2 threadB = new Thread2(sharedObject);

        threadA.start();
        threadB.start();
    }

}
