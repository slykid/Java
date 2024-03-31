package com.java.kilhyun.OOP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ex28_4_OutputStreamTest {

    public static void main(String[] args)
    {
        try {
            OutputStream os = new FileOutputStream("D:\\workspace\\Java\\Java\\data\\test.txt");
            byte[] data = "ABC".getBytes();
//            for(int i = 0; i < data.length; i++)
//            {
//                os.write(data[i]);
//            }

            os.write(data, 1, 2);

            os.flush();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
