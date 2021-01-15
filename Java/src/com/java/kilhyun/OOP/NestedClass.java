package com.java.kilhyun.OOP;

public class NestedClass {

    // 외부 클래스
    NestedClass()
    {
        System.out.println("NestedClass 객체 생성");
    }

    // 인스턴스 멤버 클래스
    class InstanceMemberClass
    {
        InstanceMemberClass()
        {
            System.out.println("InstanceMemberClass 객체 생성");
        }

        int field1;
        void method1()
        {
            System.out.println("InstanceMemberClass.method1 호출");
        }
    }

    // 정적 멤버 클래스
    static class StaticMemberClass
    {
        StaticMemberClass()
        {
            System.out.println("StaticMemberClass 객체 생성");
        }

        int field1;
        static int field2;

        void method1()
        {
            System.out.println("StaticMemberClass.method1 호출");
        }

        static void method2()
        {
            System.out.println("StaticMemberClass.method2 호출");
        }

    }

    // 로컬 클래스
    void method()
    {
        class LocalClass
        {
            LocalClass()
            {
                System.out.println("LocalClass 객체 생성");
            }
            int field1;
            void method1()
            {
                System.out.println("LocalClass.method1 호출");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.field1 = 1;
        System.out.println(localClass.field1);
        localClass.method1();

    }

}
