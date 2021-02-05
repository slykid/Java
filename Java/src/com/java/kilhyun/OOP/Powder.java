package com.java.kilhyun.OOP;

public class Powder extends Meterial{
    public String toString()
    {
        return "재료는 파우더입니다.";
    }

    @Override
    public void doPrinting()
    {
        System.out.println("Powder 로 프린팅합니다.");
    }
}
