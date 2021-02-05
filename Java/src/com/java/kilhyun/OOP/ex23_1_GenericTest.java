package com.java.kilhyun.OOP;

public class ex23_1_GenericTest {

    /*
        제네릭 프로그래밍
        - 변수의 선언이나 메소드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형으로 변환될 수 있도록 프로그래밍하는 방식
        - 실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식으로 볼 수 있다.

        자료형 매개변수 T
        - type 의 의미이며, 여러 참조 자료형으로 대체될 수 있는 부분

    */

    public static void main(String[] args)
    {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);

        System.out.println(powderPrinter.toString());

        System.out.println();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);

        System.out.println(powderPrinter.toString());

        // 재료에는 포함되는 안되는 물(water) 가 들어온다면?
        // - 상위클래스를 선언해서 재료에 해당하는 클래스가 상위클래스를 상속받도록 설정해주면,
        //   상속을 받는 재료들만 사용하도록 제약을 줄 수 있다.



    }

}
