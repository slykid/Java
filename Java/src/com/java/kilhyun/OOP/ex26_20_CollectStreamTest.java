package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ex26_20_CollectStreamTest {

    public static void main(String[] args)
    {
        List<Student8> totalList = Arrays.asList(
                new Student8("홍길동", 90, Student8.Sex.MALE),
                new Student8("유재석", 100, Student8.Sex.MALE),
                new Student8("송지효", 93, Student8.Sex.FEMALE),
                new Student8("하동훈", 85, Student8.Sex.MALE),
                new Student8("전소민", 85, Student8.Sex.FEMALE)
        );

        // 남학생만 리스트로 생성
        System.out.println("1. 남학생만 List로 생성");
        List<Student8> maleList = totalList.stream()
                .filter(obj -> obj.getSex() == Student8.Sex.MALE)
                .collect(Collectors.toList());

        maleList.stream()
                .forEach(obj -> System.out.println(obj.getName()));

        // 여학생만 HashSet으로 생성
        System.out.println("\n2. 여학생만 HashSet으로 생성");
        Set<Student8> femaleSet = totalList.stream()
                .filter(obj -> obj.getSex() == Student8.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet :: new));

        femaleSet.stream()
                .forEach(obj -> System.out.println(obj.getName()));
    }
}
