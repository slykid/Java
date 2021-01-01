package com.java.kilhyun.OOP;

public class ex11_Service {
    @PrintAnnotation
    public void method1()
    {
        System.out.println("실행 내용 1");
    }

    @PrintAnnotation("*")
    public void method2()
    {
        System.out.println("실행 내용 2");
    }

    @PrintAnnotation(value="#", number=10)
    public void method3()
    {
        System.out.println("실행 내용 3");
    }

}
