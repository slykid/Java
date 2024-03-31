package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex26_4_ParallelStreamTest {

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("홍길동", "유재석", "송지효", "하동훈", "전소민", "이광수");

        // 순차처리
        Stream<String> streamSequence = list.stream();
        streamSequence.forEach(ex26_4_ParallelStreamTest::print);  // s -> ex26_4_ParallelStreamTest.print(s) 와 동일

        System.out.println("=================================================");

        // 병렬처리
        Stream<String> streamParallel = list.parallelStream();
        streamParallel.forEach(ex26_4_ParallelStreamTest::print);

    }

    public static void print(String str)
    {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
