package com.java.kilhyun.OOP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex24_8_HashMapCollectionTest {

    public static void main(String[] args)
    {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<String, Integer>();

        // 객체 입력
        map.put("유재석", 80);
        map.put("하동훈", 99);
        map.put("양세찬", 65);
        map.put("송지효", 70);
        map.put("전소민", 76);

        // map 크기 확인
        System.out.println("총 Entry 수: " + map.size());

        // 객체 검색
        System.out.println("하동훈 : " + map.get("하동훈"));
        System.out.println();

        // 객체 출력
        Set<String> keySet = map.keySet();  // KeySet 추출
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext())
        {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("송지효");
        System.out.println("총 Entry 수: " + map.size());

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext())
        {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\tKey: " + key + ", Value: " + value);
        }
        System.out.println();

        // 객체 전체 삭제
        map.clear();
        System.out.println("총 Entry 수: " + map.size());

    }

}
