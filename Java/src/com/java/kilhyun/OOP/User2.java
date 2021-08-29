package com.java.kilhyun.OOP;

public class User2 extends Thread{

    private CalculatorForThread calculator;

    public void setCalculator(CalculatorForThread calculator)
    {
        this.setName("User2");
        this.calculator = calculator;
    }

    public void run()
    {
        calculator.setMemory(50);
    }

}
