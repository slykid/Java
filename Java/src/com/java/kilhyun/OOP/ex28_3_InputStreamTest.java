package com.java.kilhyun.OOP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ex28_3_InputStreamTest {

    public static void main(String[] args)
    {
        int readByteNo;
        byte[] readByteResult = new byte[100];

        try {
            InputStream is = new FileInputStream("D:\\workspace\\Java\\Java\\data\\test.png");

            while( (readByteNo = is.read(readByteResult, 0, 100)) != -1)
            {
                System.out.println(readByteResult[readByteNo-1]);
            }

            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
