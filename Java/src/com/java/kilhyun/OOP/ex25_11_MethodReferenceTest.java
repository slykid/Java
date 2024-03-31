package com.java.kilhyun.OOP;

import java.util.function.IntBinaryOperator;

public class ex25_11_MethodReferenceTest {

    public static void main(String[] args)
    {
        // 정적 메소드
        IntBinaryOperator operator = (x, y) -> Calculator2.staticMethod(x, y);
        System.out.println("결과1 : " + operator.applyAsInt(10, 20));

        operator = Calculator2::staticMethod;
        System.out.println("결과2 : " + operator.applyAsInt(30, 40));

        // 인스턴스 메소드
        Calculator2 obj = new Calculator2();

        operator = (x, y) -> obj.instanceMethod(x, y);
        System.out.println("결과3 : " + operator.applyAsInt(50, 60));

        operator = obj::instanceMethod;
        System.out.println("결과4 : " + operator.applyAsInt(70, 80));

    }

}
