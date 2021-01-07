package com.java.kilhyun.OOP;

public class Intermediate extends PlayerLevel{
    public void run()
    {
        System.out.println("플레이어가 달립니다.");
    }

    public void jump()
    {
        System.out.println("플레이어가 점프합니다.");
    }

    public void turn()
    {
        System.out.println("레벨 제한에 따라 턴을 할 수 없습니다.");
    }

    public void showLevelMessage()
    {
        System.out.println("플레이어의 레벨은 중급자 입니다.");
    }

}
