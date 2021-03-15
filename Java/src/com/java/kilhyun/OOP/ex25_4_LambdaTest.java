package com.java.kilhyun.OOP;

public class ex25_4_LambdaTest {

    public static void main(String[] args)
    {
        UsingThis usingThis = new UsingThis();
        UsingThis.Inner inner = usingThis.new Inner();
        inner.method();
    }
}
