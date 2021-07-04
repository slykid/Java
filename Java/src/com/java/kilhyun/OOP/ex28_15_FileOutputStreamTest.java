package com.java.kilhyun.OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex28_15_FileOutputStreamTest {

    public static void main(String[] args)
    {
        try
        {
            String orgFileName = "C:/Users/slyki/Pictures/test_image.png";
            String targetFileName = "C:/Temp/test_image.png";

            FileInputStream fis = new FileInputStream(orgFileName);
            FileOutputStream fos = new FileOutputStream(targetFileName);

            int readByteNo;
            byte[] readBytes = new byte[100];

            while( (readByteNo = fis.read(readBytes)) != -1)
            {
                fos.write(readBytes, 0, readByteNo);
            }

            fos.flush();
            fos.close();
            fis.close();

            System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�.");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
