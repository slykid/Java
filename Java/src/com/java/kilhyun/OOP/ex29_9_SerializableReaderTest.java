package com.java.kilhyun.OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ex29_9_SerializableReaderTest {

    public static void main(String[] args)
    {
        try {
            FileInputStream fis = new FileInputStream("C:/TEMP/Object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            TestA v = (TestA) ois.readObject();

            System.out.println("field1 : " + v.field1);
            System.out.println("field2 : " + v.field2.field1);
            System.out.println("field3 : " + v.field3);
            System.out.println("field4 : " + v.field4);

            ois.close(); fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
