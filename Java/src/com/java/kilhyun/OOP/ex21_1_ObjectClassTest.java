package com.java.kilhyun.OOP;

class BookObj {

    String title;
    String author;

    public BookObj(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    // toString 메소드 재정의
    @Override
    public String toString() {
        return author + "." + title;
    }

}

public class ex21_1_ObjectClassTest {

    public static void main(String[] args)
    {
        System.out.println("1. toString()");

        BookObj book = new BookObj("토지", "박경림");

        System.out.println("저자: " + book.author + " , 제목 : " + book.title);
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str);   // Q. 똑같이 객체를 출력했는데, 왜 주소가 나오지 않고 문자열이 출력될까?
                                   // A. String 클래스 내에 존재하는 toString() 이라는 내용이 재정의 되어있고,

        // BookObj 클래스에서 재정의된 toString() 메소드 확인
        // 비교를 위해 위에 재정의된 toString() 메소드를 주석처리 전후로 비교하면 됨
        System.out.println(str.toString()); // String 객체를 출력할 때는 String 객체.toString() 으로 출력되도록 되어있다.

        System.out.println("=============================================");

        System.out.println("2. equals()");

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);  // 물리적으로 동일한지 (객체의 주소를 비교)
        System.out.println(str1.equals(str2));  // 논리적으로 동일한지 (객체 내의 값을 비교)

        System.out.println();

        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentKim = new Student(100, "이상원");

        System.out.println(studentLee == studentLee2);  // 서로 주소가 같기 때문에 true 반환
        System.out.println(studentLee == studentKim);   // 서로 주소가 다르기 때문에 false 반환
        System.out.println(studentLee.equals(studentKim));  // 논리적으로 같음을 재정의 해야된다.

    }

}
