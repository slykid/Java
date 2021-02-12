package com.java.kilhyun.OOP;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ex24_3_LinkedListCollectionTest {

    public static void main(String[] args)
    {
        List<String> linkedList1 = new ArrayList<String>();
        List<String> linkedList2 = new LinkedList<String>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++)
        {
            linkedList1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime();

        System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for(int i = 0; i < 10000; i++)
        {
            linkedList2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + " ns");
    }

}
