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

    }

}
