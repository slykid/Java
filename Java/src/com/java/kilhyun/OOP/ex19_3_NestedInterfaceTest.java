package com.java.kilhyun.OOP;

public class ex19_3_NestedInterfaceTest {

    public static void main(String[] args)
    {
        Button btn = new Button();

        btn.setClickListener(new CallListener());
        btn.touch();

        btn.setClickListener(new MessageListener());
        btn.touch();
    }

}
