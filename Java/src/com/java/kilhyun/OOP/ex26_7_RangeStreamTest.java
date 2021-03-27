package com.java.kilhyun.OOP;

import java.util.stream.IntStream;

public class ex26_7_RangeStreamTest {

    public static int sum;

    public static void main(String[] args)
    {
        IntStream stream = IntStream.rangeClosed(1, 100);
        stream.forEach( n -> sum += n);

        System.out.println("총합: " + sum);
    }

}
