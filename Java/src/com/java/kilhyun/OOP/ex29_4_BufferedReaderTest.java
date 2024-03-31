package com.java.kilhyun.OOP;

import java.io.*;

public class ex29_4_BufferedReaderTest {

    public static void main(String[] args)
    {
        try {

            InputStream is = System.in;
            Reader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);

            System.out.print("�Է�: ");
            String line = br.readLine();

            System.out.println("���: " + line);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
