package com.java.kilhyun.OOP;

import java.util.function.IntBinaryOperator;

public class ex25_9_LambdaOperatorTest {

    private static int[] scores = {93, 87, 99};

    public static int maxOnMin(IntBinaryOperator operator)
    {
        int result = scores[0];
        for(int score : scores)
        {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args)
    {
        // 최대값 계산
        int maxValue = maxOnMin( (a, b) -> {
                    if (a >= b) return a;
                    else return b;
                });
        System.out.println("최대값: " + maxValue);

        int minValue = maxOnMin( (a, b) -> {
            if (a <= b) return a;
            else return b;
        });
        System.out.println("최소값: " + minValue);

    }

}
