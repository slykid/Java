package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex26_6_ArrayStreamTest {

    public static void main(String[] args)
    {
        // 문자열 배열인 경우
        String[] strArray = { "홍길동", "유재석", "박명수" };
        Stream<String> strStream = Arrays.stream(strArray);  // 배열객체에서 스트림 생성

        strStream.forEach(s -> System.out.print(s + ", "));
        System.out.println();

        // 숫자형 배열인 경우
        int[] numArray = { 1, 2, 3, 4, 5 };
        IntStream intStream = Arrays.stream(numArray);  // 배열객체에서 스트림 생성
        intStream.forEach(num -> System.out.print(num + ", "));
        System.out.println();
    }

}
