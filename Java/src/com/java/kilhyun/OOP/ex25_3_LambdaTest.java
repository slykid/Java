package com.java.kilhyun.OOP;

public class ex25_3_LambdaTest {

    public static void main(String[] args)
    {
        MyFunctionalInterface3 fi;

        fi = (x, y) -> {
            int result1 = x + y;
            return result1;
        };

        System.out.println(fi.method(2, 5));

        fi = (x, y) -> { return x + y; };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> x + y;
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sumNumber(x, y);
        System.out.println(fi.method(2, 5));
    }

    public static int sumNumber(int x, int y)
    {
        return (x + y);
    }

}
