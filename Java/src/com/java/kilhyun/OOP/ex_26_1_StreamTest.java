package com.java.kilhyun.OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex_26_1_StreamTest {

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr).sum();  // Array의 경우 클래스 이하에 존재하는 Arrays.stream() 으로 스트림 생성이 가능
        int count = (int)Arrays.stream(arr).count();  // count() 의 경우 반환되는 결과가 Long 타입이므로 형변환 필요

        System.out.println(sum);
        System.out.println(count);

        System.out.println("===============================================================");

        List<String> list = new ArrayList<String>();

        list.add("Tom");
        list.add("Edward");
        list.add("Jack");
        list.add("Brian");

        Stream<String> stream = list.stream(); // 컬렉션의 경우 .stream() 메소드로 스트림 생성 가능
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.stream().sorted().forEach(s -> System.out.print(s + " "));  // 앞서 사용한 stream 변수는 사용불가
        System.out.println();                                            // 때문에 list.stream() 으로 스트림 생성
                                                                         // sorted() : 중간 연산
                                                                         // forEach() : 최종연산
        // 위의 예제에서 sorted() 의 경우 Comparable 이 구현되어 있어 사용가능함
        // 만약 Comparable이 선언되지 않은 경우라면, 직접 구현해줘야 함.

        list.stream().map(s -> s.length()).forEach(n -> System.out.println(n));

    }

}
