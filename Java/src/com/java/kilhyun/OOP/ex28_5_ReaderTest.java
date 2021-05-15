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
            int readData;

            while ((readData = reader.read()) != -1) {
                char charData = (char) readData;
                System.out.print(charData + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
