package com.java.kilhyun.OOP;

import java.util.*;

public class ex24_12_TreeMapOrderTest {

    public static void main(String[] args)
    {
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(55), "김현수");
        scores.put(new Integer(100), "유재석");
        scores.put(new Integer(80), "이광수");
        scores.put(new Integer(65), "양세찬");

        // 1. 내림차순 정렬
        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();

        for(Map.Entry<Integer, String> entry : descendingEntrySet)
        {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println();

        // 2. 오름차순 정렬
        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();

        for(Map.Entry<Integer, String> entry : ascendingEntrySet)
        {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }

}
