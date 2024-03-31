package com.java.kilhyun.OOP;

public class ex22_4_ThrowsTest {

    public static void main(String[] args)
    {
        try
        {
            findClass();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("클래스가 존재하지 않습니다.");
            System.out.println(e);
        }
    }

    public static void findClass() throws ClassNotFoundException
    {
        Class clazz = Class.forName("java.lang.String2");
    }

}
