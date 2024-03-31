package com.java.kilhyun.OOP;

public class ex19_2_NestedClassBoundaryTest {

    public static void main(String[] args)
    {
        Outter outter = new Outter();

        Outter.Nested nested = outter.new Nested();
        nested.print();
    }

}
