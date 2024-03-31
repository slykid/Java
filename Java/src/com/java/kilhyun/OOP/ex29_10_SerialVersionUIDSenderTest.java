package com.java.kilhyun.OOP;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ex29_10_SerialVersionUIDSenderTest {

    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream("C:/TEMP/Object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            TestC testC = new TestC();
            testC.field1 = 1;
            oos.writeObject(testC);
            oos.flush(); oos.close(); fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
