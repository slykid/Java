package com.java.kilhyun.OOP;

public class Thread2 extends Thread {

    private SharedObject sharedObject;

    public Thread2(SharedObject sharedObject)
    {
        this.sharedObject = sharedObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++)
        {
            sharedObject.methodB();
        }
    }

}
