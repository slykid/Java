package com.java.kilhyun.OOP;

public abstract class Phone {

    public String owner; // 소유주

    // 생성자
    public Phone(String owner)
    {
        this.owner = owner;
    }

    public void turnOn()
    {
        System.out.println("전원을 킵니다.");
    }

    public void turnOff()
    {
        System.out.println("전원을 끕니다.");
    }
}
