package com.java.kilhyun.OOP;

public class ManualCar extends Car{

    @Override
    public void drive()
    {
        System.out.println("주행을 시작합니다.");
        System.out.println("기어 변속은 변속기를 사용해주세요");
    }

    @Override
    public void stop()
    {
        System.out.println("속도가 0이 될 때까지 브레이크 페달을 밟아주세요");
        System.out.println("주행을 정지합니다.");
    }

}
