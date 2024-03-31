package com.java.kilhyun.OOP;

import java.awt.*;

public class ex30_6_SleepTest {

    public static void main(String[] args)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i = 0; i < 10; i++)
        {
            toolkit.beep();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) { }
        }
    }

}
