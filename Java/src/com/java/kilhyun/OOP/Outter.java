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
            System.out.println(this.field);
            this.method();

            System.out.println();

            System.out.println(Outter.this.field);
            Outter.this.method();
        }
    }
}
