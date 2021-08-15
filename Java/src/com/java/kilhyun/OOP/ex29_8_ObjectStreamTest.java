package com.java.kilhyun.OOP;

import java.io.*;

public class ex29_8_ObjectStreamTest {

    public static void main(String[] args)
    {
        try {
            FileOutputStream fos = new FileOutputStream("C:/TEMP/Object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(new Integer(10));
            oos.writeObject(new Double(3.14));
            oos.writeObject(new int[] {1, 2, 3});
            oos.writeObject(new String("slykid"));

            oos.flush(); oos.close(); fos.close();

            FileInputStream fis = new FileInputStream("C:/TEMP/Object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Integer obj1 = (Integer) ois.readObject();
            Double obj2 = (Double) ois.readObject();
            int[] obj3 = (int[]) ois.readObject();
            String obj4 = (String) ois.readObject();

            ois.close(); fis.close();

            System.out.println("Object1 : " + obj1);
            System.out.println("Object2 : " + obj2);
            System.out.println("Object3 : " + obj3[0] + ", " + obj3[1] + ", " + obj3[2]);
            System.out.println("Object4 : " + obj4);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
