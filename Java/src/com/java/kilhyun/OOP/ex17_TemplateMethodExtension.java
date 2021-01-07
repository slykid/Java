package com.java.kilhyun.OOP;

public class ex17_TemplateMethodExtension {

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
