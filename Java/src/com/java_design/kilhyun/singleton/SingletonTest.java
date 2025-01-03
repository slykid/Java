package com.java_design.kilhyun.singleton;

public class SingletonTest
{

    public static void main(String[] args)
    {
        ConnectionPool instanace1 = ConnectionPool.getInstance();
        ConnectionPool instanace2 = ConnectionPool.getInstance();

        System.out.println(instanace1 == instanace2);

    }

}
