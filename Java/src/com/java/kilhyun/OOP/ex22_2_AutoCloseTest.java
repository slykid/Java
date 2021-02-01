package com.java.kilhyun.OOP;

public class ex22_2_AutoCloseTest {

    public static void main(String[] args)
    {
        try(AutoCloseObj obj = new AutoCloseObj())
        {
            // 강제로 Exception 발생
            throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
