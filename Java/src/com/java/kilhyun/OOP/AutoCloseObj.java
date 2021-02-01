package com.java.kilhyun.OOP;

public class AutoCloseObj implements AutoCloseable{
    @Override
    public void close() throws Exception
    {
        System.out.println("close() 메소드가 호출되었습니다.");
    }
}
