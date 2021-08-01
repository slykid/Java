package com.java.kilhyun.OOP;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ex29_3_BufferInputStreamTest {

    public static void main(String[] args)
    {
        try
        {
            long start = 0;
            long end = 0;

            // 보조 스트림 사용하지 않은 경우
            FileInputStream fis1 = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");
            start = System.currentTimeMillis();

            while (fis1.read() != -1) {}
            end = System.currentTimeMillis();

            System.out.println("사용하지 않은 경우: " + (end - start) + "ms");
            fis1.close();

            System.out.println("=========================================================");

            // 보조 스트림을 사용한 경우
            FileInputStream fis2 = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");
            BufferedInputStream bis = new BufferedInputStream(fis2);

            start = System.currentTimeMillis();

            while(bis.read() != -1) {}
            end = System.currentTimeMillis();

            System.out.println("사용한 경우: " + (end - start) + "ms");
            bis.close();
            fis2.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }

}
