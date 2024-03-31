package com.java.kilhyun.OOP;

public class ex19_1_NestedClassTest {

    public static void main(String[] args)
    {
        NestedClass a = new NestedClass();

        // 인스턴스 멤버 클래스 호출
        NestedClass.InstanceMemberClass b = a.new InstanceMemberClass();
        b.field1 = 3;
        b.method1();

        // 정적 멤버 클래스 호출
        NestedClass.StaticMemberClass c = new NestedClass.StaticMemberClass();
        c.field1 = 4;
        c.method1();
        NestedClass.StaticMemberClass.field2 = 5;
        NestedClass.StaticMemberClass.method2();

        // 로컬 클래스 호출
        a.method();
    }

}
