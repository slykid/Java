package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ex26_13_AsStreamAndBoxedTest {

    public static void main(String[] args)
    {
        int[] intArray = { 1, 2, 3, 4, 5 };

        IntStream intStream = Arrays.stream(intArray);
        intStream.asDoubleStream()
                .forEach(dNum -> System.out.println(dNum));

        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream.boxed()
                .forEach(obj -> System.out.println(obj.intValue()));
    }

}
