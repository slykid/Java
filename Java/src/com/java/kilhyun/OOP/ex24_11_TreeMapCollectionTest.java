package com.java.kilhyun.OOP;

import java.util.Map;
import java.util.TreeMap;

public class ex24_11_TreeMapCollectionTest {

    public static void main(String[] args)
    {
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(new Integer(87), "홍길동");
        scores.put(new Integer(55), "김현수");
        scores.put(new Integer(100), "유재석");
        scores.put(new Integer(80), "이광수");
        scores.put(new Integer(65), "양세찬");

        Map.Entry<Integer, String> entry = null;

        // 1. firstEntry()
        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());

        // 2. lastEntry()
        entry = scores.lastEntry();
        System.out.println("가장 높은 점수: " + entry.getKey() + "-" + entry.getValue());

        System.out.println();


        // 3. lowerEntry()
        entry = scores.lowerEntry(new Integer(80));
        System.out.println("80점 이하인 점수: " + entry.getKey() + "-" + entry.getValue());

        // 4. higherEntry()
        entry = scores.higherEntry(new Integer(65));
        System.out.println("65점 이상인 점수: " + entry.getKey() + "-" + entry.getValue());

        System.out.println();


        // 5. floorEntry()
        // 1) TreeMap 에 포함되어 있는 경우
        entry = scores.floorEntry(new Integer(80));
        System.out.println("80점 이하인 점수: " + entry.getKey() + "-" + entry.getValue());

        // 2) TreeMap 에 포함되지 않은 경우
        entry = scores.floorEntry(new Integer(95));
        System.out.println("95점 이하인 점수: " + entry.getKey() + "-" + entry.getValue());

        // 6. ceilingEntry()
        // 1) TreeMap 에 포함되어 있는 경우
        entry = scores.ceilingEntry(new Integer(65));
        System.out.println("65점 이상인 점수: " + entry.getKey() + "-" + entry.getValue());

        // 2) TreeMap 에 포함되지 않은 경우
        entry = scores.ceilingEntry(new Integer(75));
        System.out.println("75점 이하인 점수: " + entry.getKey() + "-" + entry.getValue());

        System.out.println();


        // 7. pollFirstEntry()
        while(!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-" + entry.getValue());
            System.out.println("남은 객체 수: " + scores.size());
            System.out.println();
        }

    }

}
