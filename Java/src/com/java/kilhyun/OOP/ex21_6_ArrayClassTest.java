package com.java.kilhyun.OOP;

import java.util.Arrays;

public class ex21_6_ArrayClassTest {

    public static void main(String[] args)
    {
        // 1. Array Copy
        char[] arr1 = {'J', 'A', 'V', 'A'};

        // Arrays.copyOf() 메소드
        char[] arr2 = Arrays.copyOf(arr1, arr1.length);  // 전체 복사 시, 원본 배열의 길이를 입력해 주는 것이 좋다.
        System.out.println(Arrays.toString(arr2));

        // Arrays.copyOfRange() 메소드
        char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
        System.out.println(Arrays.toString(arr3));

        // System.arraycopy() 메소드
        char[] arr4 = new char[arr1.length];
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);

        for(int i = 0; i < arr4.length; i++)
            System.out.println("arr4[" + i + "] : " + arr4[i]);

        System.out.println();

        // 2. equals
        int[][] original = { {1,2}, {3,4} };

        System.out.println ("앝은 복제 후 비교");
        int[][] clone1 = Arrays.copyOf(original, original.length);
        System.out.println("배열 번지 비교: " + original.equals(clone1));
        System.out.println("1차 배열 항목 비교: " + Arrays.equals(original, clone1));
        System.out.println("종합 배열 항목 비교: " + Arrays.deepEquals(original, clone1));

        System.out.println();

        System.out.println("깊은 복제 후 비교");
        int[][] clone2 = Arrays.copyOf(original, original.length);
        clone2[0] = Arrays.copyOf(original[0], original[0].length);
        clone2[1] = Arrays.copyOf(original[1], original[1].length);
        System.out.println("배열 번지 비교: " + original.equals(clone2));
        System.out.println("1차 배열 항목 비교: " + Arrays.equals(original, clone2));
        System.out.println("종합 배열 항목 비교: " + Arrays.deepEquals(original, clone2));

        // 3. sort()
        // 1) 숫자형 배열 정렬
        int[] scores = {99, 77, 88};

        Arrays.sort(scores);

        for(int i = 0 ; i < scores.length; i++)
        {
            System.out.println("scores[" + i + "] : " + scores[i]);
        }

        System.out.println();

        // 2) 문자형 배열 정렬
        String[] names = {"홍길동", "김현수", "이순신"};
        Arrays.sort(names);

        for(int i = 0 ; i < names.length; i++)
        {
            System.out.println("names[" + i + "] : " + names[i]);
        }

        System.out.println();

        // 3) 클래스 타입 배열
        Member m1 = new Member("전소민");
        Member m2 = new Member("유재석");
        Member m3 = new Member("이광수");

        Member[] members = {m1, m2, m3};
        Arrays.sort(members);

        for(int i = 0 ; i < members.length; i++)
        {
            System.out.println("members[" + i + "] : " + members[i].name);
        }

        System.out.println();

        // 4. 배열 검색
        // 1) 숫자형 배열
        scores = new int[]{99,67,83};

        // 배열 오름차순 정렬
        Arrays.sort(scores);

        int idx = Arrays.binarySearch(scores, 83);
        System.out.println("83's index: " + idx);


        // 2) 문자열 배열
        names = new String[]{"양세찬", "김종국", "송지효"};

        Arrays.sort(names);

        idx = Arrays.binarySearch(names, "송지효");
        System.out.println("송지효's index: " + idx);


        // 3) 클래스 배열
        m1 = new Member("하동훈");
        m2 = new Member("설민석");
        m3 = new Member("최진기");

        members = new Member[]{m1, m2, m3};

        Arrays.sort(members);

        idx = Arrays.binarySearch(members, m2);
        System.out.println("m2' index: " + idx);


    }

}
