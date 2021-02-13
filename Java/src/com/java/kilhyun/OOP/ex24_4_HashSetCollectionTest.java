package com.java.kilhyun.OOP;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ex24_4_HashSetCollectionTest {

    public static void main(String[] args)
    {
        Set<String> set1 = new HashSet<String>();

        // add() : Set 내에 원소를 추가
        set1.add("Java");
        set1.add("JDBC");
        set1.add("Servlet/JSP");
        set1.add("Java");
        set1.add("iBATIS");

        int size = set1.size();
        System.out.println("총 객체 수: " + size);

        // - Iterator 사용법
        Iterator<String> iterator = set1.iterator();

        while(iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        // remove() : Set 내에 존재하는 특정 원소를 제거
        set1.remove("JDBC");
        set1.remove("iBATIS");

        System.out.println("총 객체 수: " + size);

        iterator = set1.iterator();
        while(iterator.hasNext())
        {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        // clear() : Set 내에 존재하는 모든 원소를 제거
        set1.clear();

        if(set1.isEmpty())
        {
            System.out.println("비어 있음");
        }
        else
        {
            System.out.println("원소 존재함");
        }

    }

}
