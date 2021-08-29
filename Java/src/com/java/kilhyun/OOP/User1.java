package com.java.kilhyun.OOP;

public class User1 extends Thread{

    private CalculatorForThread calculator;

    public void setCalculator(CalculatorForThread calculator) {
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run()
    {
        calculator.setMemory(100);
    }

}
