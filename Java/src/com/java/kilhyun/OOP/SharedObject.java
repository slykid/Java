package com.java.kilhyun.OOP;

public class SharedObject {
    public synchronized void methodA() {
        System.out.println("Thread1 �۾�����");

        notify(); // ����ȭ ������� �Ͻ����� ���¿��� �����带 ���డ�ɻ��·� ��ȯ

        try {
            wait();
        } catch (InterruptedException e) { }

    }

    public synchronized void methodB() {
        System.out.println("Thread2 �۾�����");

        notify();

        try {
            wait();
        } catch (InterruptedException e) { }
    }

}
