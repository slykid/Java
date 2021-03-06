package com.java.kilhyun.OOP;

public class ex25_1_LambdaTest {

    public static void main(String[] args)
    {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call";
            System.out.println(str);
        };
        fi.method();


        fi = () -> { System.out.println("method call2"); };
        fi.method();

        fi = () -> System.out.println("method call3");  // 실행문이 1개 이므로 중괄호 생략
        fi.method();
    }

}
