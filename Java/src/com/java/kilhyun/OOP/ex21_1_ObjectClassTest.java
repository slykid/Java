package com.java.kilhyun.OOP;

class BookObj implements Cloneable{

    String title;
    String author;

    public BookObj(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    // toString 메소드 재정의
    @Override
    public String toString()
    {
        return author + "." + title;
    }

    // 반드시 class 가 Cloneable 인터페이스를 구현한다는 것을 작성한 후 오버라이딩해야됨
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ex21_1_ObjectClassTest {

    public static void main(String[] args) throws CloneNotSupportedException {
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

        System.out.println("=============================================");

        System.out.println("3. hashCode()");

        // 두 개의 객체에 대한 값이 같다면, 두 객체의 해시코드 값도 동일하다.
        System.out.println(studentLee.hashCode());
        System.out.println(studentKim.hashCode());

        System.out.println();

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));  // true
        System.out.println(i1.hashCode());  // 100
        System.out.println(i2.hashCode());  // 100

        // 객체의 실제 주소 확인 방법
        System.out.println(System.identityHashCode(i1));  // 460141958
        System.out.println(System.identityHashCode(i2));  // 1163157884

        System.out.println("=============================================");

        System.out.println("4. clone()");

        // 객체의 복사본을 생성함
        // 정보은닉에 위배 가능성이 있기 때문에 복제할 객체를 cloneable 인터페이스를 명시해야함

        BookObj book2 = (BookObj)book.clone();  // 메모리 복제를 통해 Exception 이 발생할 수 있음
        System.out.println(book2);  // cloneable 하지 않은 데 사용해서 컴파일 시 에러가 발생함
                                    // -> 해당 클래스에 Cloneable 인터페이스를 구현하도록 설정해주면 됨

    }

}
