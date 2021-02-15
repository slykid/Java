package com.java.kilhyun.OOP;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ex24_6_TreeSetOrderTest {

    public static void main(String[] args)
    {
        TreeSet<Integer> scores = new TreeSet<Integer>();

        scores.add(new Integer(87));
        scores.add(new Integer(98));
        scores.add(new Integer(46));
        scores.add(new Integer(100));
        scores.add(new Integer(67));

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer score : descendingSet)
        {
            System.out.println(score + " ");
        }

        System.out.println();

        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for(Integer score : ascendingSet)
        {
            System.out.println(score + " ");
        }

    }

}
