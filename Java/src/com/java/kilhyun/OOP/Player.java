package com.java.kilhyun.OOP;

/*
   레벨에 따라 플레이어가 할 수 있는 행동(run, jump, turn)을 설정한다.
   레벨은 초급, 중급, 고급 으로 나눔
   레벨은 상위 추상 클래스인 PlayerLevel 클래스를 상속받는다.
   레벨이 초급이면 run()까지, 중급이면 jump() 까지, 고급이면 turn() 까지 수행한다.

 */

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new Beginner();
        level.showLevelMessage();
    }

    public PlayerLevel getpLevel() {
        return level;
    }

    public void levelUp(PlayerLevel level)
    {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count)
    {
        level.go(count);
    }

}
