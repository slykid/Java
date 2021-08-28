package com.java.kilhyun.OOP;

import java.awt.*;

public class ex30_1_MultiThreadTest {

    public static void main(String[] args)
    {
        // ��� 1. ������ Ŭ������ �����ϱ�
        Runnable beep = new BeepTask();
        Thread thread = new Thread(beep);
        thread.start();

        // ��� 2. �͸�ü Ȱ���ϱ�
        Thread thread_anonymous = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        Toolkit toolkit = Toolkit.getDefaultToolkit();

                        for (int i = 0; i < 5; i++)
                        {
                            toolkit.beep();

                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }

                    }
                });
        thread_anonymous.start();

        // ��� 3. ���ٽ� Ȱ���ϱ�
        Thread thread_lambda = new Thread( () -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for(int i = 0; i < 5; i++)
            {
                toolkit.beep();

                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        });
        thread_lambda.start();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("��!");

            try {
                Thread.sleep(500);
            } catch(Exception e) {
                e.printStackTrace();
            }

        }

    }

}
