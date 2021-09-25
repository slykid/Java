package com.java.kilhyun.OOP;

public class ThreadB extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run()
    {
        while(stop) {
            if(work) {
                System.out.println("Thread B 작업 내용");
            } else {
                Thread.yield();
            }
        }

        System.out.println("Thread B 종료");

    }

}
