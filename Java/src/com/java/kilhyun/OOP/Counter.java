package com.java.kilhyun.OOP;

public class Counter {

    private int no;

    public Counter(int no)
    {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println(no + "번 객체의 finalize() 메소드 실행");
    }
}
