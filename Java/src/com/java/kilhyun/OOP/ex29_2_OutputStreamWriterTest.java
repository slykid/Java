package com.java.kilhyun.OOP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ex29_2_OutputStreamWriterTest {

    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream("C:/TEMP/file.txt");
            Writer writer = new OutputStreamWriter(fos);

            String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
            writer.write(data);

            writer.flush();
            writer.close();

            System.out.println("파일 저장이 끝났습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
