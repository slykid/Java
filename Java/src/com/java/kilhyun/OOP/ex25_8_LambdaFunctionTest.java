package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ex25_8_LambdaFunctionTest {

    private static List<Student3> list = Arrays.asList(
        new Student3("홍길동", 90, 96),
        new Student3("유재석", 100, 93)
    );

    public static void printString(Function<Student3, String> function)
    {
        for(Student3 student : list)
        {
            System.out.print(function.apply(student) + " ");
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student3> function)
    {
        for(Student3 student : list)
        {
            System.out.print(function.applyAsInt(student) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        System.out.println("[학생이름]");
        printString( t -> t.getName() );

        System.out.println("[영어점수]");
        printInt( t -> t.getEnglishScore() );

        System.out.println("[수학점수]");
        printInt( t -> t.getMathScore() );
    }

}
