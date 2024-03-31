package com.java.kilhyun.OOP;

public class ex23_3_GenericMethodTest {

    public static void main(String[] args)
    {
        Box<Integer> box1 = Util.boxing(100);
        int intValue = box1.get();

        Box<String> box2 = Util.boxing("slykid");
        String strValue = box2.get();

        System.out.println(intValue + "\n");
        System.out.println(strValue);

    }
}
