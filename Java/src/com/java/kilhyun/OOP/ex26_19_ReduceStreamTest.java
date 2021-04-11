package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;

public class ex26_19_ReduceStreamTest {

    public static void main(String[] args)
    {
        List<Student7> studentList = Arrays.asList(
                new Student7("홍길동", 92),
                new Student7("유재석", 100),
                new Student7("송지효", 85)
        );

        int sum1 = studentList.stream()
                .mapToInt(Student7::getScore)
                .sum();

        int sum2 = studentList.stream()
                .map(Student7::getScore)
                .reduce( (a, b) -> a + b )
                .get();

        int sum3 = studentList.stream()
                .map(Student7::getScore)
                .reduce( 0, (a, b) -> a + b );

        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        System.out.println("Sum3 = " + sum3);

    }

}
