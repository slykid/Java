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

            // ���� ��Ʈ�� ������� ���� ���
            FileInputStream fis1 = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");
            start = System.currentTimeMillis();

            while (fis1.read() != -1) {}
            end = System.currentTimeMillis();

            System.out.println("������� ���� ���: " + (end - start) + "ms");
            fis1.close();

            System.out.println("=========================================================");

            // ���� ��Ʈ���� ����� ���
            FileInputStream fis2 = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");
            BufferedInputStream bis = new BufferedInputStream(fis2);

            start = System.currentTimeMillis();

            while(bis.read() != -1) {}
            end = System.currentTimeMillis();

            System.out.println("����� ���: " + (end - start) + "ms");
            bis.close();
            fis2.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }

}
