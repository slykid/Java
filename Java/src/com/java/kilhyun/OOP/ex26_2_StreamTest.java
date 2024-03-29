package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ex26_2_StreamTest {

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("홍길동", "신용권", "김자바");

        // Iterator 사용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.print(name + " ");
        }
        System.out.println();

        // Stream 사용
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.print(name + " "));
        System.out.println();

    }

}
