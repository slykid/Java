package com.java.kilhyun.OOP;

public class CompleteCalc extends Calculator {
    @Override
    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2)
    {
        if (num1 == 0 && num2 == 0)  // 둘 다 0 인 경우
        {
            return ERROR;
        }
        else
        {
            if (num1 > num2)
            {
                return num2 / num1;
            }
            else
            {
                return num1 / num2;
            }
        }
    }

    public void showInfo()
    {
        System.out.println("모두 구현하였습니다.");
    }

    // ex18-3 에서 사용
    @Override
    public void description()
    {
        System.out.println("재정의 한 description");
    }
}
