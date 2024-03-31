package com.java.kilhyun.OOP;

public class ex15_TemplateMethodTest {

    public static void main(String[] args)
    {
        Car autoCar = new AutomaticCar();
        Car manualCar = new ManualCar();

        autoCar.run();
        System.out.println("====================");
        manualCar.run();
    }

}
