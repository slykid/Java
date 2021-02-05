package com.java.kilhyun.OOP;

public class Plastic extends Meterial{
    public String toString()
    {
        return "재료는 플라스틱입니다.";
    }

    @Override
    public void doPrinting()
    {
        System.out.print("Plastic으로 프린팅합니다.");
    }
}
