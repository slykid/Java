package com.java.kilhyun.OOP;

import java.util.HashMap;
import java.util.Map;

public class ex24_9_HashMapUseClassTest {

    public static void main(String[] args)
    {
        Map<Student2, Integer> map = new HashMap<Student2, Integer>();

        map.put(new Student2(1, "유재석"), 95);
        map.put(new Student2(1, "유재석"), 95);

        System.out.println("총 Entry 수: " + map.size());
    }
}
