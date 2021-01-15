package com.java.kilhyun.OOP;

public interface Sort {

    public void ascending(int[] arr);
    public void descending(int[] arr);

    public default void description()
    {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }

}
