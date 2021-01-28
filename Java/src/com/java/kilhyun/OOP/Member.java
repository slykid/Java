package com.java.kilhyun.OOP;

public class Member implements Comparable<Member>{

    String name;

    Member(String name)
    {
        this.name = name;
    }

    /*
        compareTo()
        - 오름차순일때 자신이 매개값보다 작으면 음수, 같으면 0, 높으면 양수를 반환하는 메소드임
        - Member 타입만 비교하기 위해 제네릭 <> 을 사용함
        - 비교값을 반환하도록 설정함
     */
    @Override
    public int compareTo(Member o)
    {
        return name.compareTo(o.name);
    }
}
