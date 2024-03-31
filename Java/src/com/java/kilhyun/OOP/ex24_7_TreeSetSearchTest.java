package com.java.kilhyun.OOP;

import java.util.NavigableSet;
import java.util.TreeSet;

public class ex24_7_TreeSetSearchTest {

    public static void main(String[] args)
    {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("cherry");
        treeSet.add("positive");
        treeSet.add("guess");

        System.out.println("[g] 이 전의 단어 검색");
        NavigableSet<String> rangeSet = treeSet.headSet("g", true);
        for(String word : rangeSet)
            System.out.println(word);

        System.out.println();

        System.out.println("[f] 이 후의 단어 검색");
        rangeSet = treeSet.tailSet("f", true);
        for(String word : rangeSet)
            System.out.println(word);

        System.out.println();

        System.out.println("[c ~ f] 사이의 단어 검색");
        rangeSet = treeSet.subSet("c", true, "f", true);
        for(String word : rangeSet)
            System.out.println(word);

    }

}
