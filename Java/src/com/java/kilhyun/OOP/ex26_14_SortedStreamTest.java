package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ex26_14_SortedStreamTest {

    public static void main(String[] args)
    {
        IntStream intStream = Arrays.stream( new int[] {1, 2, 3, 4, 5} );

        intStream.sorted()
                .forEach(n -> System.out.print(n + ", "));

        System.out.println();

        // 객체요소일 경우
        List<Student6> studentList = Arrays.asList(
                new Student6("홍길동", 90),
                new Student6("유재석", 100),
                new Student6("하동훈", 80)
        );

        studentList.stream()
                .sorted()                   // 출력하는 결과를 기준으로 정렬 (예시의 경우, 점수)
                .forEach(s -> System.out.print(s.getScore() + " "));
        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())  // 내림차순으로 정렬
                .forEach(s -> System.out.print(s.getScore() + " "));
    }

}
