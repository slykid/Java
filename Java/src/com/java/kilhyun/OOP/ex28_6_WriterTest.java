package com.java.kilhyun.OOP;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ex28_6_WriterTest {

    public static void main(String[] args)
    {
        try
        {
            Writer writer = new FileWriter("data/test1.txt");

            // 1. write(int c)
//            char[] buffer = "홍길동".toCharArray();
//
//            for(int i = 0; i < buffer.length; i++)
//            {
//                writer.write(buffer[i]);
//            }

            // 2. write(char[] cbuf)
//            char[] buffer = "slykid".toCharArray();
//            writer.write(buffer);

            // 3. write(char[] cbuf, int off, int len)
//            char[] buffer = "My name is slykid".toCharArray();
//            writer.write(buffer, 3, 10);
//
//            System.out.println("My name is slykid".substring(3, 13))

            // 4. write(String str), write(String str, int off, int len)
            String buffer = "My name is slykid!";
            writer.write(buffer);
            // writer.write(buffer, 3, 10);

            writer.close();  // close() 메소드까지 실행되야 파일에 저장됨
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
