package com.java.kilhyun.OOP;

public class Car1 {

    public void drive()
    {
        System.out.println("주행을 시작합니다.");
    }
    public void stop()
    {
        System.out.println("주행을 중지합니다.");
    }
    public void startCart()
    {
        System.out.println("시동을 겁니다.");
    }
    public void turnOff()
    {
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메소드
    final public void run()
    {
        startCart();
        drive();
        stop();
        turnOff();
    }

}
