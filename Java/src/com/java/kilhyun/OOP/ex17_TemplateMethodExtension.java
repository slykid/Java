package com.java.kilhyun.OOP;

public class ex17_TemplateMethodExtension {

    /*
    예제
    레벨에 따라 플레이어가 할 수 있는 행동(run, jump, turn)을 설정한다.
    레벨은 초급, 중급, 고급 으로 나눔
    레벨은 상위 추상 클래스인 PlayerLevel 클래스를 상속받는다.
    레벨이 초급이면 run()까지, 중급이면 jump() 까지, 고급이면 turn() 까지 수행한다.
    각 레벨별로 플레이어의 레벨을 출력하는 메소드인 showLevelMessage() 를 구현한다.


    문제의 취지는 객체지향의 특징인 다형성을 살려서 if 조건문 대신에
    다양한 조건을 수행할 수 있도록 코드를 구성하는 것이 목적임
    */

    public static void main(String[] args)
    {
        Player player = new Player();
        player.play(1);
        System.out.println();

        Intermediate im = new Intermediate();
        player.levelUp(im);
        player.play(2);
        System.out.println();

        Advenced ad = new Advenced();
        player.levelUp(ad);
        player.play(3);
        System.out.println();

    }

}
