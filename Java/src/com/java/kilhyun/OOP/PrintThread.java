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
            System.out.println("���� ��");
        }
        System.out.println("�ڿ� ����");
        System.out.println("��������");
    }

}
