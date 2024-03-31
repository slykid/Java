package com.java.kilhyun.OOP;

public class AutomaticCar extends Car{
    @Override
    public void drive()
    {
        System.out.println("자율주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop()
    {
        System.out.println("자동차가 스스로 주행을 정지합니다.");
        System.out.println("자율주행을 중지합니다.");
    }

}
