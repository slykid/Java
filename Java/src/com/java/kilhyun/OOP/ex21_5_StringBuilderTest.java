package com.java.kilhyun.OOP;

public class ex21_5_StringBuilderTest {

    public static void main(String[] args)
    {
         StringBuilder sBuilder = new StringBuilder();

         sBuilder.append("Java ");
         sBuilder.append("Programming Study");

         System.out.println(sBuilder.toString());   // StringBuilder 객체에 저장된 문자열을 출력하기 위해서는
                                                    // String 형을 변환해주는 .toString() 메소드를 사용한다.

        sBuilder.insert(4, "10");
        sBuilder.insert(4, "ver.");
        System.out.println(sBuilder.toString());

        sBuilder.setCharAt(4, ' ');
        System.out.println(sBuilder.toString());

        sBuilder.replace(23, 29, "club");
        System.out.println(sBuilder.toString());

        sBuilder.delete(4, 8);
        System.out.println(sBuilder.toString());

        System.out.println();

        int length = sBuilder.length();
        System.out.println("총 문자수 : " + length);

        String result = sBuilder.toString();
        System.out.println(result);
    }

}
