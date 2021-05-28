package com.java.kilhyun.OOP;

import java.io.IOException;
import java.io.InputStream;

public class ex28_8_HangulSystemInTest {

    public static void main(String[] args)
    {
        InputStream is = System.in;
        byte[] buffer = new byte[100];

        try {
            System.out.print("이름: ");
            int numBytes = is.read(buffer);
            String name = new String(buffer);

            System.out.println();

            System.out.print("하고 싶은 말: ");
            numBytes = is.read(buffer);
            String comments = new String(buffer);

            System.out.println();
            System.out.println("작성자 이름: " + name);
            System.out.println("하고싶은 말: " + comments);

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
