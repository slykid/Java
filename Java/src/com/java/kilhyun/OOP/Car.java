package com.java.kilhyun.OOP;

public abstract class Car {
    
    public abstract void drive();
    public abstract void stop();
    
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
