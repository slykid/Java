package com.java.kilhyun.OOP;

import java.util.Arrays;

public class ex26_17_AggregateStreamTest {

    public static void main(String[] args)
    {
        // 1. count()
        System.out.println("Aggregate Function 1. count()");
        long count = Arrays.stream( new int[] {1, 2, 3, 4, 5} )
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("입력 중 2의 배수 개수: " + count);

        // 2. sum()
        System.out.println("Aggregate Function 2. sum()");
        long sum = Arrays.stream( new int[] {1, 2, 3, 4, 5} )
                .filter( n -> n % 2 == 0)
                .sum();
        System.out.println("입력 중 2의 배수인 요소들의 총합: " + sum);

        // 3. average()
        System.out.println("Aggregate Function 3. average()");
        double avg = Arrays.stream( new int[] {1, 2, 3, 4, 5} )
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();  // average() 반환 값이 OptionalDouble 이기 때문
        System.out.println("입력 중 2의 배수인 요소들의 평균: " + avg);

        // 4. max()
        System.out.println("Aggregate Function 4. max()");
        int max = Arrays.stream( new int[] {1, 2, 3, 4, 5} )
                .filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
        System.out.println("입력 중 2의 배수인 요소 중 최대값: " + max);

        // 5. min()
        System.out.println("Aggregate Function 5. min()");
        int min = Arrays.stream( new int[] {1, 2, 3, 4, 5} )
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("입력 중 2의 배수인 요소 중 최대값: " + min);

        // 6. first()
        System.out.println("Aggregate Function 6. first()");
        int first = Arrays.stream( new int[] {1, 2, 3, 4, 5} )
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("입력 중 3의 배수 중 첫번째 요소: " + first);

    }

}
