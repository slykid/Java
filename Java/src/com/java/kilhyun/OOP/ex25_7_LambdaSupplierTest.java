package com.java.kilhyun.OOP;

import java.util.function.IntSupplier;

public class ex25_7_LambdaSupplierTest {

    public static void main(String[] args)
    {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };

        int num = intSupplier.getAsInt();

        System.out.println("눈의 수: " + num);
    }

}
