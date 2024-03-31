package com.java.kilhyun.OOP;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ex28_5_ReaderTest {

    public static void main(String[] args)
    {
        try
        {
            Reader reader = new FileReader("D:\\workspace\\Java\\Java\\data\\test.txt");

            // 1. read()
//            int readData;
//            while ((readData = reader.read()) != -1) {
//                char charData = (char) readData;
//                System.out.print(charData + " ");
//            }

            // 2. read(char[] cbuf)
//            int readCharNum;
//            char[] buffer = new char[2];
//
//            while ( (readCharNum = reader.read(buffer)) != -1 ){
//                System.out.print(buffer);
//            }

            // 3. read(char[] cbuf, int off, int len)
            char[] buffer = new char[100];
            int readCharNum = reader.read(buffer, 0, 100);

            System.out.println("읽은 문자 수: " + readCharNum);
            System.out.print("읽은 문자: " + String.valueOf(buffer));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
