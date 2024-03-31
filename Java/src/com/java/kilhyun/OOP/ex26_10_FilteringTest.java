package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;

public class ex26_10_FilteringTest {

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("유재석", "신용재", "조권", "송지효", "하지원", "전소민");

        list.stream()
            .distinct()    // 중복제거
            .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
            .filter(n -> n.startsWith("신"))
            .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
            .distinct()
            .filter(n -> n.startsWith("신"))
            .forEach(n -> System.out.println(n));
        System.out.println();

    }

}
