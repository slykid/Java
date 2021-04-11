package com.java.kilhyun.OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class ex26_18_OptionalClassTest {

    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();

        // 예외 발생 예정
        try {
            double avg = list.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .getAsDouble();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        finally {
            // 해결법 1
            OptionalDouble optional = list.stream()
                    .mapToInt(Integer::intValue)
                    .average();
            if (optional.isPresent()) {
                System.out.println("방법1. 평균: " + optional.getAsDouble());
            } else {
                System.out.println("방법1. 평균: 0.0");
            }

            // 해결법 2
            double avg = list.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0.0);
            System.out.println("방법2. 평균: " + avg);

            // 해결법 3
            list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent( a -> System.out.println("방법3. 평균: " + a));
        }

    }

}
