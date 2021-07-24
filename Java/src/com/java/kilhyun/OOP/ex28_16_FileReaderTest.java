package com.java.kilhyun.OOP;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ex28_16_FileReaderTest {

    public static void main(String[] args)
    {
        try
        {
            // FileReader 객체 생성
            // 방법 1
//            FileReader reader1 = new FileReader("C:/TEMP/1.txt");

            // 방법 2
//            File file = new File("C:/TEMP/1.txt");
//            FileReader reader2 = new FileReader(file);


            FileReader reader1 = new FileReader("D:\\workspace\\Java\\Java\\src\\com\\java\\kilhyun\\OOP\\ex01_StudentTest.java");


            int readCharNo;
            char[] cbuf = new char[100];
            while ((readCharNo = reader1.read(cbuf)) != -1)
            {
                // 읽은 문자 배열 출력
                String data = new String(cbuf, 0, readCharNo);
                System.out.println(data);
            }
            reader1.close();


        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
