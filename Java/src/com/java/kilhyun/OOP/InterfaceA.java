package com.java.kilhyun.OOP;

public interface InterfaceA {

    public void method1();

    public default void method2()
    {
        System.out.println("InterfaceA - method2 실행");
    }

}
