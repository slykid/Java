package com.java.kilhyun.OOP;

import java.util.StringTokenizer;

public class ex21_4_StringParsingTest {

    public static void main(String[] args)
    {
        // 1. split()
        String str1 = "홍길동&이수현,박연수,김현호&최수진";

        String[] names = str1.split("&|,");

        for(String name : names)
        {
            System.out.println(name);
        }

        System.out.println();

        // 2. StringTokenizer
        String str2 = "홍길동/이수현/박연수";
        StringTokenizer tokens = new StringTokenizer(str2, "/");

        System.out.println("토큰 수 : " + tokens.countTokens());

        // 2-1. for 문 사용
        int tokenNum = tokens.countTokens();
        for(int i = 0; i < tokenNum; i++)
        {
            String token = tokens.nextToken();
            System.out.println(token);
        }


        System.out.println();

        // 2-2. while 문 사용
        tokens = new StringTokenizer(str2, "/");
        while(tokens.hasMoreTokens())
        {
            String token = tokens.nextToken();
            System.out.println(token);
        }

    }

}
