package com.java.kilhyun.OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ex29_9_SerializableWriterTest {

    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream("C:/TEMP/Object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            TestA testA = new TestA();
            testA.field1 = 10;
            testA.field2.field1 = 2;
            TestA.field3 = 3;
            testA.field4 = 4;

            oos.writeObject(testA);
            oos.flush(); oos.close(); fos.close();

            System.out.println("객체 저장을 완료했습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
