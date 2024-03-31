package com.java.kilhyun.OOP;

import java.util.Arrays;

public class ex26_15_LoopingStreamTest {
    /*
        루핑(Looping)
        - 요소전체를 반복하는 것

        - 주요 메소드
          - peek() : 중간 처리 시, 전체 요소에 대해 추가 작업을 하기 위해서 사용함
          - forEach() : 전체 요소에 대한 처리를 하는 메소드 / 요소를 소비하기 때문에, 이 후에 sum() 등의 함수사용불가

     */


    public static void main(String[] args)
    {
        int[] intArr = { 1, 2, 3, 4, 5 };

        System.out.println("[peek() 를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
              .filter(a -> a % 2 == 0)
              .peek(n -> System.out.println(n));  // 동작 x

        System.out.println("[최종 처리 메소드를 마지막으로 호출할 경우]");
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("총합: " + total);

        System.out.println("[forEach() 메소드를 사용할 경우]");
        Arrays.stream(intArr)
              .filter(a -> a % 2 == 0)
              .forEach(n -> System.out.println(n));
    }

}
