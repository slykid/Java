package com.java.kilhyun.OOP;

public class ex18_7_InterfaceTest {

    public static void main(String[] args)
    {
        InterfaceA if1 = new ClassA();
        InterfaceA if2 = new ClassB();

        if1.method1();
        if1.method2();

        System.out.println();

        if2.method1();
        if2.method2();

    }

}
