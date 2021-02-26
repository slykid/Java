package com.java.kilhyun.OOP;

public class Person2 implements Comparable<Person2>{

    public String name;
    public int age;

    public Person2(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person2 o)
    {
        if(age < o.age)
            return -1;
        else if(age == o.age)
            return 0;
        else
            return 1;
    }
}
