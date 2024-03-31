package com.java.kilhyun.OOP;

public class ex30_2_InheritThreadTest {

    public static void main(String[] args)
    {
        Thread thread = new BeepThread();
        thread.start();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("¶ò!");

            try {
                Thread.sleep(500);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

    }

}
