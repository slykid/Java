package com.java.kilhyun.OOP;

public class ThreadA extends Thread{

    public boolean stop = false;
    public boolean work = true;

    public void run()
    {
        while(stop) {
            if(work) {
                System.out.println("Thread A �۾� ����");
            } else {
                Thread.yield();
            }
        }

        System.out.println("Thread A ����");

    }

}
