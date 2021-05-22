package com.java.kilhyun.OOP;

import java.io.IOException;
import java.io.InputStream;

public class ex28_7_SystemInTest {

    public static void main(String[] args)
    {
        try {
            System.out.println("== 메뉴 ==");
            System.out.println("1. 예금 조회");
            System.out.println("2. 예금 출금");
            System.out.println("3. 예금 입금");
            System.out.println("4. 종료");

            System.out.print("메뉴를 입력하세요: ");

            InputStream is = System.in;
            char inputChar = (char) is.read();

            System.out.println();

            switch (inputChar)
            {
                case '1': System.out.println("예금 조회를 선택했습니다."); break;
                case '2': System.out.println("예금 출금을 선택했습니다."); break;
                case '3': System.out.println("예금 입금을 선택했습니다."); break;
                case '4': System.out.println("프로그램을 종료합니다."); break;
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
