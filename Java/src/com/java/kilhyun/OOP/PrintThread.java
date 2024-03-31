package com.java.kilhyun.OOP;

public class PrintThread extends Thread{

    private boolean stopFlag;

    public void setStopFlag(boolean stopFlag)
    {
        this.stopFlag = stopFlag;
    }

    public void run()
    {
        while(!stopFlag)
        {
            System.out.println("실행 중");
        }
        System.out.println("자원 정리");
        System.out.println("실행종료");
    }

}
