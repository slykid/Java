package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;

public class ex26_21_ContainerStreamTest {

    public static void main(String[] args)
    {
        List<Student8> totalList = Arrays.asList(
                new Student8("홍길동", 90, Student8.Sex.MALE),
                new Student8("유재석", 100, Student8.Sex.MALE),
                new Student8("송지효", 93, Student8.Sex.FEMALE),
                new Student8("하동훈", 85, Student8.Sex.MALE),
                new Student8("전소민", 85, Student8.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student8.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }

}
