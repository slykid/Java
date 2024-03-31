package com.java.kilhyun.OOP;

import java.io.*;

public class ex29_5_BufferedOutputStreamTest {

    public static void main(String[] args)
    {
        try {

            FileInputStream fis = null;
            FileOutputStream fos = null;
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;

            int data = -1;
            long start = 0;
            long end = 0;

            fis = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream("C:/TEMP/test.png");
            start = System.currentTimeMillis();
            while ((data = bis.read()) != -1)
            {
                fos.write(data);
            }
            fos.flush();
            end = System.currentTimeMillis();
            fos.close(); bis.close(); fis.close();

            System.out.println("사용하지 않은 경우: " + (end - start) + "ms");

            fis = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream("C:/TEMP/test.png");
            bos = new BufferedOutputStream(fos);
            start = System.currentTimeMillis();
            while ((data = bis.read()) != -1)
            {
                bos.write(data);
            }
            bos.flush();
            end = System.currentTimeMillis();
            bos.close(); fos.close(); bis.close(); fis.close();

            System.out.println("사용한 경우: " + (end - start) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
