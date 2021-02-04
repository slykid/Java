package com.java.kilhyun.OOP;

public class Account {

    private long balence;

    public Account() { }

    public long getBalence()
    {
        return balence;
    }

    public void deposit(int money)
    {
        balence += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException
    {
        if(balence < money)
        {
            // 사용자 예외 넘기기
            // try - catch 로 넘길 수 있지만, 대부분 자신을 호출한 부분에서 예외 객체를 생성하고, 예외에 대한
            // 에러 메세지를 처리하도록 throws 키워드를 추가해서 사용한다.
            throw new BalanceInsufficientException("잔고부족:" + (money - balence) + " 모자람");
        }
        balence -= money;
    }
}
