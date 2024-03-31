package com.java.kilhyun.OOP;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) 
    {
        if(o1.price < o2.price)  // o1 가격이 o2 보다 적은 경우
            return 1;
        else if(o1.price == o2.price)  // 가격이 같은 경우
            return 0;
        else                    // o1 가격이 o2 보다 큰 경우
            return -1;
    }
}
