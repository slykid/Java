package com.java.kilhyun.OOP;

public class ex18_6_InterfaceTest {

    /*

    인터페이스 구현 + 클래스 상속

    구현하려는 하위 클래스에 상속하려는 상위 클래스는 extends 를 이용해서 상속 받고,
    인터페이스는 implements 를 사용해 인터페이스도 구현할 수 있다.

     */

    public static void main(String[] args)
    {
        ShelfQueue bookQueue = new BookShelf();

        bookQueue.enQueue("해리포터1");
        bookQueue.enQueue("해리포터2");
        bookQueue.enQueue("해리포터3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }

}
