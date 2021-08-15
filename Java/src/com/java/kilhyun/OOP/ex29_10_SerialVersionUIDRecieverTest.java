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
            System.out.println("정상실행됬습니다.");
            System.out.println("TestC 에 내용을 추가하고 위의 출력문이 안나오면 성공입니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
