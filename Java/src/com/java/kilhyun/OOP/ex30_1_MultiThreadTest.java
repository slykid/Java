package com.java.kilhyun.OOP;

import java.awt.*;

public class ex30_1_MultiThreadTest {

    public static void main(String[] args)
    {
        // 방법 1. 별도의 클래스로 생성하기
        Runnable beep = new BeepTask();
        Thread thread = new Thread(beep);
        thread.start();

        // 방법 2. 익명객체 활용하기
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

        // 방법 3. 람다식 활용하기
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
            System.out.println("띵!");

            try {
                Thread.sleep(500);
            } catch(Exception e) {
                e.printStackTrace();
            }

        }

    }

}
