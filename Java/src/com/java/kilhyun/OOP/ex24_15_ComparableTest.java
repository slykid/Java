package com.java.kilhyun.OOP;

import java.util.Iterator;
import java.util.TreeSet;

public class ex24_15_ComparableTest {

    public static void main(String[] args)
    {
        TreeSet<Person2> treeSet = new TreeSet<Person2>();

        treeSet.add(new Person2("홍길동", 24));
        treeSet.add(new Person2("유재석", 48));
        treeSet.add(new Person2("David", 30));

        Iterator<Person2> iterator = treeSet.iterator();
        while(iterator.hasNext())
        {
            Person2 person = iterator.next();
            System.out.println(person.name + " - " + person.age);
        }

    }

}
