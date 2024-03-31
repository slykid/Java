package com.java.kilhyun.OOP;

import java.awt.*;

public class ex30_1_SingleThreadTest {

    public static void main(String[] args)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // beep 음 발생
        for(int i = 0; i < 5; i++)
        {
            toolkit.beep();
            try {
                Thread.sleep(500);  // 0.5초 일시정지
            } catch(Exception e) {
                e.printStackTrace();
            }

        }

        // 콘솔 프린팅
        for(int i = 0; i < 5; i++)
        {
            System.out.println("띵!");
            try {
                Thread.sleep(500); // 0.5초 일시정지
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
