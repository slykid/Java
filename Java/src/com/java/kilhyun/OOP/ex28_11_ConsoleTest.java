package com.java.kilhyun.OOP;

import java.io.Console;

public class ex28_11_ConsoleTest {

    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("���̵�: ");
        String id = console.readLine();

        System.out.print("�н�����: ");
        char[] charPw = console.readPassword();
        String passwd = new String(charPw);

        System.out.println("===========================");
        System.out.println(id);
        System.out.println(passwd);

    }
}
