package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;

public class ex26_5_MapAndReduceTest {

    public static void main(String[] args)
    {
        List<Student5> list = Arrays.asList(
                new Student5("홍길동", 80),
                new Student5("유재석", 100),
                new Student5("조세호", 90)
        );

        double avg = list.stream()
                .mapToInt(Student5::getScore) // 중간처리
                .average()                    // 최종처리
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }

}
