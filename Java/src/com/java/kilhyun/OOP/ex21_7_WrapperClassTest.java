package com.java.kilhyun.OOP;

public class ex21_7_WrapperClassTest {

    public static void main(String[] args)
    {
        // 1. Boxing
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println();

        // 2. Unboxing
        System.out.println(obj1.intValue());
        System.out.println(obj2.intValue());
        System.out.println(obj3.intValue());

        System.out.println();


        // 3. 자동 박싱 & 언박싱
        // 1) 자동 박싱
        Integer objInt = 100;
        System.out.println("objInt value: " + objInt.intValue());

        System.out.println();

        // 2) 자동 언박싱
        int value = objInt;
        System.out.println("value: " + value);

        int result = objInt + 100;
        System.out.println("result: " + result);

    }

}
