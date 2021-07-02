package com.java.kilhyun.OOP;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex28_13_FileScanTest {

    public static void main(String[] args)
    {
        try
        {
            File dir = new File("C:/Temp");
            File file1 = new File("C:/Temp/1.txt");
            File file2 = new File("C:/Temp/2.txt");
            File file3 = new File("C:/Temp/3.txt");

            // 디렉터리 및 파일 존재 여부 확인
            // 존재 하지 않으면 생성
            if (dir.exists() == false) {
                dir.mkdir();
            }
            if (file1.exists() == false) {
                file1.createNewFile();
            }
            if (file2.exists() == false) {
                file2.createNewFile();
            }
            if (file3.exists() == false) {
                file3.createNewFile();
            }

            File temp = new File ("C:/Temp");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");

            File[] contents = temp.listFiles();
            System.out.println("날짜          시간       형태    크기     이름");
            System.out.println("========================================================");
            for(File f : contents)
            {
                System.out.print(sdf.format(new Date(f.lastModified())));

                if(f.isDirectory()) {
                    System.out.print("\t<DIR>\t\t\t" + f.getName());
                } else {
                    System.out.print("\t\t\t" + f.length() + "\t  " + f.getName());
                }
                System.out.println();
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}
