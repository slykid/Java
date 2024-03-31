package com.java.kilhyun.OOP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ex29_7_PrintStreamTest {

    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream("C:/TEMP/file.txt");
            PrintStream ps = new PrintStream(fos);

            ps.println("[프린터 보조 스트림]");
            ps.print("마치 ");
            ps.println("프린터가 출력하는 것 처럼 ");
            ps.println("데이터가 출력됩니다.");

            ps.flush();
            ps.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
