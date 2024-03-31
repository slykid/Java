package com.java.kilhyun.OOP;

import java.io.IOException;
import java.io.InputStreamReader;

public class ex28_1_SystemInTest {

    public static void main(String[] args)
    {
        System.out.print("�Է� (������ ���� �κп��� �Է�����) : ");

        // �Է� �ÿ��� �ݵ�� try - catch ���� ���� �ۼ����� ��!
        try {
            int input;
            InputStreamReader isr = new InputStreamReader(System.in); // �ѱ� = 2����Ʈ �̹Ƿ� �ܼ� read() �Լ��δ� �б� �Ұ���

            while ((input = isr.read()) != '��') {
                System.out.print((char) input);
                System.out.print(" ");
            }

            isr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
