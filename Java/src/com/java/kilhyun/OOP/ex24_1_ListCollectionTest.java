package com.java.kilhyun.OOP;

import java.util.*;

public class ex24_1_ListCollectionTest {

    public static void main(String[] args)
    {
        // 1. ArrayList 기본 사용법
        // 1) ArrayList 객체 생성
        List<String> list1 = new ArrayList<String>();

        // 2) ArrayList 객체에 요소 추가
        list1.add("Java");
        list1.add("JDBC");
        list1.add("Servlet/JSP");
        list1.add(2, "DataBase");
        list1.add("iBATIS");

        // 3) ArrayList 길이 구하기
        int size = list1.size();  // 현재 리스트에 존재하는 총 객체 수
        System.out.println("총 객체 수: " + size);
        System.out.println();

        // 4) 멤버쉽 테스트
        String skill = list1.get(2);  // 2번 인덱스의 값을 가져옴
        System.out.println("2. " + skill);
        System.out.println();

        // 5) 반복문을 이용한 리스트 요소 출력
        for(int i = 0; i < list1.size(); i++)
        {
            String str = list1.get(i);
            System.out.println(i + ": " + str);
        }

        System.out.println();

        // 6) 리스트 요소 삭제하기
        list1.remove(2);
        list1.remove(2);
        list1.remove("iBATIS");

        for(int i = 0; i < list1.size(); i++)
        {
            String str = list1.get(i);
            System.out.println(i + ": " + str);
        }

        // 2. Arrays.asList()
        List<String> list2 = Arrays.asList("홍길동", "유재석", "신용재");
        for(String name : list1)
            System.out.println(name);

        List<Integer> list3 = Arrays.asList(1, 2, 3);
        for(int value : list3)
            System.out.println(value);
    }

}
