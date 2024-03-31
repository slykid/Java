package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex26_3_StreamTest {

    public static void main(String[] args)
    {
        // List로 구현
        List<Student5> studentList = Arrays.asList(
            new Student5("홍길동", 90),
            new Student5("신용권", 92)
        );

        // Stream으로 구현
        Stream<Student5> stream = studentList.stream();  // List를 스트림으로 변환
        stream.forEach( s -> {
            String name = s.getName();
            int score = s.getScore();

            System.out.println(name + " - " + score);
        });

    }

}
