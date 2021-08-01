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

            String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
            writer.write(data);

            writer.flush();
            writer.close();

            System.out.println("���� ������ �������ϴ�.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
