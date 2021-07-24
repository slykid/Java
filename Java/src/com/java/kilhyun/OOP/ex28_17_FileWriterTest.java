package com.java.kilhyun.OOP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ex28_17_FileWriterTest {

    public static void main(String[] args)
    {

        try {
            // FileWriter ��ü ���� ���
            // ��� 1.
            FileWriter writer1 = new FileWriter("C:/TEMP/file.txt");

            // ��� 2.
//            File file = new File("C:/TEMP/file.txt");
//            FileWriter writer2 = new FileWriter("C:/TEMP/file.txt");

            writer1.write("FileWriter�� �ѱ۷� ��" + "\r\n");
            writer1.write("���ڿ��� �ٷ� ����� �� �ִ�." + "\r\n");
            writer1.flush();
            writer1.close();

            System.out.println("���Ͽ� �����Ͽ����ϴ�.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
