package com.java.kilhyun.OOP;

public interface Calc {

    double PI = 3.141592;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    // ex18-3에서 사용
    // default 메소드
    default void description()
    {
        System.out.println("정수 계산기를 구현합니다.");
    }

    // static 메소드
    static int total(int[] arr)
    {
        int total = 0;

        for(int value : arr)
            total += value;

        return total;
    }

    // private 메소드(Java 1.9.0 이상 부터 가능 (자바 9 버전으로 변경 후 주석해제)
//     private void myMethod()
//     {
//         System.out.println("Private Method");
//     }

}
