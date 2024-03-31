package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class ex26_22_GroupingByStreamTest {

    public static void main(String[] args)
    {
        List<Student8> totalList = Arrays.asList(
                new Student8("홍길동", 90, Student8.Sex.MALE, Student8.City.SEOUL),
                new Student8("유재석", 100, Student8.Sex.MALE, Student8.City.SEOUL),
                new Student8("송지효", 93, Student8.Sex.FEMALE, Student8.City.BUSAN),
                new Student8("하동훈", 85, Student8.Sex.MALE, Student8.City.BUSAN),
                new Student8("전소민", 85, Student8.Sex.FEMALE, Student8.City.SEOUL)
        );

        //Q1. 학생들을 성별로 그룹핑하고 나서, 같은 그룹에 속하는 학생 리스트를 생성, 성별을 키로, 학생 리스트를 값으로 갖는 Map을 생성한다.
        System.out.println("Method1");

        // 구현방법 1
        Stream<Student8> totalStream1 = totalList.stream();

        // Classifier
        Function<Student8, Student8.Sex> classifier1 = Student8 :: getSex;

        // Collector
        Collector<Student8, ?, Map<Student8.Sex, List<Student8>>> collector = Collectors.groupingBy(classifier1);

        // Map
        Map<Student8.Sex, List<Student8>> mapBySex1 = totalStream1.collect(collector);

        System.out.print("[남학생] ");
        mapBySex1.get(Student8.Sex.MALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.print("\n[여학생] ");
        mapBySex1.get(Student8.Sex.FEMALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println();

        // 구현방법2
        System.out.println("\nMethod2");
        Map<Student8.Sex, List<Student8>> mapBySex2 = totalList.stream()
                .collect(Collectors.groupingBy(Student8 :: getSex));

        System.out.print("[남학생] ");
        mapBySex2.get(Student8.Sex.MALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.print("\n[여학생] ");
        mapBySex2.get(Student8.Sex.FEMALE).stream()
                .forEach(s -> System.out.print(s.getName() + " "));

        System.out.println("\n\n========================================================");

        // Q2. 학생들을 거주 도시별로 그룹핑하고나서, 같은 그룹에 속하는 학생 리스트를 생성, 거주 도시를 키로 이름 list를 값으로 하는
        //     Map을 생성한다.

        // 구현방법 1
        System.out.println("\nMethod1");
        Stream<Student8> totalStream2 = totalList.stream();

        Function<Student8, Student8.City> classifier_city = Student8 :: getCity;
        Function<Student8, String> mapper = Student8 :: getName;

        Collector<String, ?, List<String>> collector_name = Collectors.toList();
        Collector<Student8, ?, List<String>> collector_nameToCity = Collectors.mapping(mapper, collector_name);

        Collector<Student8, ?, Map<Student8.City, List<String>>> collector4 = Collectors.groupingBy(classifier_city, collector_nameToCity);

        Map<Student8.City, List<String>> mapByCity1 = totalStream2.collect(collector4);

        System.out.print("[서울] ");
        mapByCity1.get(Student8.City.SEOUL).stream()
                .forEach(s -> System.out.print(s + " "));

        System.out.print("\n[부산] ");
        mapByCity1.get(Student8.City.BUSAN).stream()
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        // 구현방법 2
        System.out.println("\nMethod2");
        Map<Student8.City, List<String>> mapByCity2 = totalList.stream()
                .collect(
                        Collectors.groupingBy (
                                Student8 :: getCity
                                , Collectors.mapping(
                                        Student8::getName
                                        , Collectors.toList()
                                )
                        )
                );

        System.out.print("[서울] ");
        mapByCity2.get(Student8.City.SEOUL).stream()
                .forEach(s -> System.out.print(s + " "));

        System.out.print("\n[부산] ");
        mapByCity2.get(Student8.City.BUSAN).stream()
                .forEach(s -> System.out.print(s + " "));

    }

}
