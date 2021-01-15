package com.java.kilhyun.OOP;

public class QuickSort implements Sort{

    @Override
    public void ascending(int[] arr)
    {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] arr)
    {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description()
    {
        Sort.super.description();  // 상위에 구현된 메소드 호출 시 super 키워드 사용
        System.out.println("QuickSort 입니다.");
    }

}
