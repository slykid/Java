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

            ps.println("[������ ���� ��Ʈ��]");
            ps.print("��ġ ");
            ps.println("�����Ͱ� ����ϴ� �� ó�� ");
            ps.println("�����Ͱ� ��µ˴ϴ�.");

            ps.flush();
            ps.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
