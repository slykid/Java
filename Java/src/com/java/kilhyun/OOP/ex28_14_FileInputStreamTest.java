package com.java.kilhyun.OOP;

import java.io.FileInputStream;
import java.io.IOException;

public class ex28_14_FileInputStreamTest {

    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream(
                    "D:/workspace/Java/Java/src/com/java/kilhyun/OOP/ex01_StudentTest.java"
            );

            int data;

            while ( (data = fis.read()) != -1 )
            {
                System.out.write(data);
            }
            fis.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
