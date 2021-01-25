package com.java.kilhyun.OOP;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class ex21_3_StringClassTest
{
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);  // 서로 다른 객체이기 때문에 주소가 다름

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);  // 힙 메모리에 생성되는 상수풀인 리터럴에서 가져오기 때문에 동일한 객체로 인식됨

        System.out.println();

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));

        java = java.concat(android);
        System.out.println(java);
        System.out.println(System.identityHashCode(java));

        System.out.println();

        System.out.println(java.charAt(2));
        System.out.println(java.equals(android));
        System.out.println(java.getBytes());
        System.out.println(java.getBytes("EUC-KR"));
        System.out.println(java.indexOf("andro"));

        System.out.println(java.length());

        for(int i = 0 ; i < java.length(); i++)
        {
           System.out.println(java.charAt(i));
        }

        String str5 = "자바 programming";
        String str6 = str5.replace("자바", "java");
        System.out.println(str6);

        String ssn = "931009-1234552";
        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String lastNum = ssn.substring(7);
        System.out.println(lastNum);


        String letter1 = "My Name";
        String letter2 = "my name";

        System.out.println(letter1.toUpperCase());
        System.out.println(letter2.toUpperCase());

        System.out.println(letter1.toLowerCase());
        System.out.println(letter2.toLowerCase());

        System.out.println(letter1.toUpperCase().equals(letter2.toUpperCase()));
        System.out.println(letter1.toLowerCase().equals(letter2.toLowerCase()));

        System.out.println("            " + str5 + "            1");
        System.out.println(("            " + str5 + "            1").trim());

        String s1 = String.valueOf(10);
        String s2 = String.valueOf(16.5);
        String s3 = String.valueOf(true);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

}
