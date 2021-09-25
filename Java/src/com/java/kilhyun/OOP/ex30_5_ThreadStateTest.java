package com.java.kilhyun.OOP;

public class ex30_5_ThreadStateTest {

    public static void main(String[] args)
    {
        StatePrintThread state = new StatePrintThread(new TargetThread());
        state.start();
    }

}
