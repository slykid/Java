package com.java.kilhyun.OOP;

public class Anonymous {

    Person1 field = new Person1() {
        void work()
        {
            System.out.println("출근");
        }

        @Override
        void wake() {
            System.out.println("6시 기상합니다");
            work();
        }
    };

    void method1()
    {
        Person1 localVar = new Person1() {
            void walk()
            {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시 기상합니다");
                walk();
            }
        };

        //로컬 변수 사용
        localVar.wake();

    }

    void method2(Person1 person)
    {
        person.wake();
    }

}
