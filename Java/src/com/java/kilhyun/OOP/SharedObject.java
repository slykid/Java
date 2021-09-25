package com.java.kilhyun.OOP;

public class SharedObject {
    public synchronized void methodA() {
        System.out.println("Thread1 작업실행");

        notify(); // 동기화 블록으로 일시정지 상태였던 스레드를 실행가능상태로 변환

        try {
            wait();
        } catch (InterruptedException e) { }

    }

    public synchronized void methodB() {
        System.out.println("Thread2 작업실행");

        notify();

        try {
            wait();
        } catch (InterruptedException e) { }
    }

}
