package com.java.kilhyun.OOP;

import java.awt.*;

public class ex30_1_SingleThreadTest {

    public static void main(String[] args)
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // beep �� �߻�
        for(int i = 0; i < 5; i++)
        {
            toolkit.beep();
            try {
                Thread.sleep(500);  // 0.5�� �Ͻ�����
            } catch(Exception e) {
                e.printStackTrace();
            }

        }

        // �ܼ� ������
        for(int i = 0; i < 5; i++)
        {
            System.out.println("��!");
            try {
                Thread.sleep(500); // 0.5�� �Ͻ�����
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
