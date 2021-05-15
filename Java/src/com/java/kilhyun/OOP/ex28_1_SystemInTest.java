package com.java.kilhyun.OOP;

import java.io.IOException;
import java.io.InputStreamReader;

public class ex28_1_SystemInTest {

    public static void main(String[] args)
    {
        System.out.print("입력 (끝으로 들어온 부분에서 입력종료) : ");

        // 입력 시에는 반드시 try - catch 문도 같이 작성해줄 것!
        try {
            int input;
            InputStreamReader isr = new InputStreamReader(System.in); // 한글 = 2바이트 이므로 단순 read() 함수로는 읽기 불가능

            while ((input = isr.read()) != '끝') {
                System.out.print((char) input);
                System.out.print(" ");
            }

            isr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
