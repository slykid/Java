package com.java.kilhyun.OOP;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ex29_10_SerialVersionUIDRecieverTest {

    public static void main(String[] args)
    {
        try {

            FileInputStream fis = new FileInputStream("C:/TEMP/Object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            TestC testc = (TestC) ois.readObject();

            System.out.println("field1 : " + testc.field1);
            System.out.println("�����������ϴ�.");
            System.out.println("TestC �� ������ �߰��ϰ� ���� ��¹��� �ȳ����� �����Դϴ�.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
