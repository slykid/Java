package com.java.kilhyun.OOP;

public class SmartPhone extends Phone {

    public SmartPhone(String owner)
    {
        super(owner);
    }

    public void internetSearch()
    {
        System.out.println("인터넷 검색을 합니다.");
    }

    public void sound()
    {
        System.out.println("따르릉");
    }
}
