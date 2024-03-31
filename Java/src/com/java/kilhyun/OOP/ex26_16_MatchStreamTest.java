package com.java.kilhyun.OOP;

import java.util.Arrays;

public class ex26_16_MatchStreamTest {

    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3 };

        boolean result = Arrays.stream(intArr)
                .allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수인지 여부: " + result);

        result = Arrays.stream(intArr)
                .anyMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 하나라도 있는지 여부: " + result);

        result = Arrays.stream(intArr)
                .noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없는지의 여부: " + result);
    }

}
