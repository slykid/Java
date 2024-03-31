package com.java.kilhyun.OOP;

public class Person {

    String name;
    int age;

    public Person() {
        this("이름없음", 1);  // 반드시 First Statement 상태여야함 = 앞에 다른 어떤 변수에 대한 선언은 없어야됨
    }

    // ex21_2 에서 사용
    public Person(String name)
    {
        this.name = name;
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void showInfo()
    {
        System.out.println(name + ", " + age);
    }

    public Person getSelf()
    {
        return this;
    }

}
