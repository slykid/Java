package com.java.kilhyun.OOP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex28_17_FileWriterTest {

    public static void main(String[] args)
    {

        try {
            // FileWriter 객체 생성 방법
            // 방법 1.
            FileWriter writer1 = new FileWriter("C:/TEMP/file.txt");

            // 방법 2.
//            File file = new File("C:/TEMP/file.txt");
//            FileWriter writer2 = new FileWriter("C:/TEMP/file.txt");

            writer1.write("FileWriter는 한글로 된" + "\r\n");
            writer1.write("문자열을 바로 출력할 수 있다." + "\r\n");
            writer1.flush();
            writer1.close();

            System.out.println("파일에 저장하였습니다.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
