package com.java.kilhyun.OOP;

public class ex18_3_InterfaceTest {

    public static void main(String[] args)
    {
        Calc calc = new CompleteCalc();

        calc.description();  // CompleteCalc 에 재정의된 description() 메소드를 주석처리 함으로써 차이 비교 가능

        int[] arr = {1,2,3,4,5};
        int sum = Calc.total(arr);  // static 메소드에 대해서는 객체가 아닌 인터페이스 타입으로부터 호출해야됨

        System.out.println(sum);

    }

}
