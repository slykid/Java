package com.java.kilhyun.OOP;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ex25_10_LambdaPredicateTest {

    private static List<Student4> list = Arrays.asList(
            new Student4("홍길동", "남자", 90),
            new Student4("유재석", "남자", 50),
            new Student4("송지효", "여자", 80),
            new Student4("전소민", "여자", 88)
    );

    public static double avg(Predicate<Student4> predicate)
    {
        int count = 0, sum = 0;
        for(Student4 student : list)
        {
            if(predicate.test(student))
            {
                count++;
                sum = student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args)
    {
        double maleAvg = avg(t -> t.getSex().equals("남자"));
        System.out.println("남자 점수 평균: " + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 점수 평균: " + femaleAvg);
    }

}
