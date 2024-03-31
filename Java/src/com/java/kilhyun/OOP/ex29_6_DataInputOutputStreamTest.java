package com.java.kilhyun.OOP;

import java.io.*;

public class ex29_6_DataInputOutputStreamTest {

    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream("data/score.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF("ȫ�浿");
            dos.writeDouble(95.5);
            dos.writeInt(1);

            dos.writeUTF("���缮");
            dos.writeDouble(94.5);
            dos.writeInt(2);

            dos.flush();
            dos.close(); fos.close();

            FileInputStream fis = new FileInputStream("data/score.dat");
            DataInputStream dis = new DataInputStream(fis);

            for (int i = 0; i < 2; i++)
            {
                String name = dis.readUTF();
                double score = dis.readDouble();
                int rank = dis.readInt();

                System.out.println("�̸�: " + name + ", ����: " + score + ", ����: " + rank);
            }
            dis.close(); fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
