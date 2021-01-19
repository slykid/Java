package com.java.kilhyun.OOP;

public class ex_20_2_RemoteControlTest {

    public static void main(String[] args)
    {
        TV tv = new TV();

        tv.field.turnOn();  // 익명 객체 필드 사용
        tv.method1();       // 익명 객체 로컬 변수 사용
        tv.method2(         // 익명 객체 매개값 사용
            new RemoteControl() {
                @Override
                public void turnOn()
                {
                    System.out.println("SmartTV를 켭니다.");
                }

                @Override
                public void turnOff()
                {
                    System.out.println("SmartTV를 끕니다.");
                }
            }
        );
    }

}
