package com.java.kilhyun.OOP;

public class ex18_1_InterfaceTest {

    /*
        인터페이스
        - 모두 추상메소드로만 구현된 클래스

        인터페이스의 역할
        - 클라이언트 프로그램에 어떤 메소드를 제공하는지 알려주는 명세 혹은 약속
        - 한 객체가 특정 인터페이스 타입이라는 말은, 해당 인터페이스의 메소드가 구현되었다는 것을 의미함
        - 클라이언트 프로그램은 실제 구현 내용은 몰라도 인터페이스의 정의만 알면 객체를 사용할 수 있다.

        추상 클래스와의 차이
        - 추상클래스의 경우, 특정 기능에 대해 공통되는 모듈이 있을 수도, 없을 수도 있으며, 클래스이기 때문에 하나씩 상속을 받는다.
        - 인터페이스의 경우, 순수하게 명세만 존재하므로 여러 개를 상속받을 수 있다.
     */

    public static void main(String[] args)
    {
        CompleteCalc calc = new CompleteCalc();
//        Calc calc = new CompleteCalc();

        int num1 = 10, num2 = 2;

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.sub(num1, num2));
        System.out.println(calc.mul(num1, num2));
        System.out.println(calc.div(num1, num2));

        calc.showInfo();
//        CompleteCalc calc_p = (CompleteCalc) calc;
//        calc_p.showInfo();
    }

}
