package com.java.kilhyun.OOP;

public class Outter {

    String field = "Outter-Field";

    void method()
    {
        System.out.println("Outter-Method");
    }

    class Nested
    {
        String field = "Nested-Field";

        void method()
        {
            System.out.println("Nested-Method");
        }

        void print()
        {
            System.out.println(this.field);  // Nested 클래스 자신의 필드
            this.method();                   // Nested 클래스 자신의 메소드

            System.out.println();

            System.out.println(Outter.this.field);  // Outter 클래스의 필드
            Outter.this.method();                   // Outter 클래스의 메소드
        }
    }
}
