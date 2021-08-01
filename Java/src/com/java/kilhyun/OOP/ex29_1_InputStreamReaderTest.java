package com.java.kilhyun.OOP;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ex29_1_InputStreamReaderTest {

    public static void main(String[] args)
    {
        try {
            InputStream is = System.in;
            Reader reader = new InputStreamReader(is);

            int readCharNo;
            char[] buffer = new char[100];

            while ((readCharNo = reader.read(buffer)) != -1) {
                String data = new String(buffer, 0, readCharNo);
                System.out.println(data);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
