package com.java.kilhyun.OOP;

public class ex18_5_InterfaceTest {
    /*
    인터페이스 상속

    인터페이스 간엣 상속이 가능함
    구현이 없으므로 extends 뒤에 여러 개의 인터페이스를 상속받을 수 있음
    구현 내용도 없기 때문에 타입 상속 이라고도 함

     */

    public static void main(String[] args)
    {
        MyClass myclass = new MyClass();

        myclass.myMethod();

        X xclass = myclass;
        xclass.x();

        Y yclass = myclass;
        yclass.y();

    }
}
