package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ex26_23_GroupingAggregationStreamTest {

    public static void main(String[] args)
    {
        List<Student8> totalList = Arrays.asList(
                new Student8("홍길동", 90, Student8.Sex.MALE, Student8.City.SEOUL),
                new Student8("유재석", 100, Student8.Sex.MALE, Student8.City.SEOUL),
                new Student8("송지효", 93, Student8.Sex.FEMALE, Student8.City.BUSAN),
                new Student8("하동훈", 85, Student8.Sex.MALE, Student8.City.BUSAN),
                new Student8("전소민", 85, Student8.Sex.FEMALE, Student8.City.SEOUL)
        );

        Map<Student8.Sex, Double> mapScoreBySex = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student8 :: getSex
                                , Collectors.averagingDouble(Student8 :: getScore)
                        )
                );
        System.out.println("[남학생 점수] " + mapScoreBySex.get(Student8.Sex.MALE));
        System.out.println("[여학생 점수] " + mapScoreBySex.get(Student8.Sex.FEMALE));

        System.out.println();

        // 성별을 쉽표로 구분한 이름을 저장하는 Map
        Map<Student8.Sex, String> mapByName = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                Student8 :: getSex
                                , Collectors.mapping(
                                        Student8 :: getName
                                        , Collectors.joining(",")
                        )
                )
        );

        System.out.println("[남학생] " + mapByName.get(Student8.Sex.MALE));
        System.out.println("[여학생] " + mapByName.get(Student8.Sex.FEMALE));
    }

}
