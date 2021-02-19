package com.java.kilhyun.OOP;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class ex24_10_HashTableCollectionTest {

    public static void main(String[] args)
    {
        Map<String, String> map = new Hashtable<String, String>();

        map.put("Spring", "12");
        map.put("Summer", "123");
        map.put("Autumn", "1234");
        map.put("Winter", "12345");

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("아이디와 비밀번호를 입력하세요");
            System.out.print("아이디: ");
            String id = scanner.nextLine();

            System.out.print("비밀번호: ");
            String passwd = scanner.nextLine();

            System.out.println();

            if(map.containsKey(id))
            {
                if(map.get(id).equals(passwd))
                {
                    System.out.println("로그인 완료");
                    break;
                }
                else
                {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            }
            else
            {
                System.out.println("입력한 아이디가 존재하지 않습니다.");
            }

        }

    }

}
