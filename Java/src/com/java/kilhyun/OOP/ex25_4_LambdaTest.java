package com.java.kilhyun.OOP;

interface PrintString
{
    void showString(String str);
}

public class ex25_4_LambdaTest {

    public static void main(String args[])
    {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Hello Lambda");

        showMyString(lambdaStr);

        // 함수형 인터페이스 타입의 객체 생성
        PrintString test = returnString();
        test.showString("Test3");
    }

    public static void showMyString(PrintString p)
    {
        p.showString("Test2");
    }

    public static PrintString returnString()
    {
        return s -> System.out.println(s + "!!!");
    }
}
