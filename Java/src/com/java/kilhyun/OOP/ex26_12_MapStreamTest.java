package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;

public class ex26_12_MapStreamTest {

    public static void main(String[] args)
    {
        List<Student5> studentList = Arrays.asList(
                new Student5("홍길동", 10),
                new Student5("신용권", 20),
                new Student5("유재석", 30)
        );

        studentList.stream()
                .mapToInt(Student5::getScore)
                .forEach(score -> System.out.println(score));
    }

}
