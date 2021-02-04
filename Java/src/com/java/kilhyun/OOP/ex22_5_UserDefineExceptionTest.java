package com.java.kilhyun.OOP;

public class ex22_5_UserDefineExceptionTest {

    /*
        사용자 정의 예외
        - 자바에서 제공해주는 기본적인 예외 클래스가 아닌 사용자가 정의한 예외클래스
        - 일반예외로 선언할 경우 Exception 클래스를 상속
        - 런타임예외로 선언할 경우 RuntimeException 클래스를 상속

        - "예외명Exception" 형식으로 클래스명을 구성
        - try - catch 문을 사용하는 것이 아닌, 예외 발생 부분에 예외 클래스를 객체화 하고,
          생성된 객체를 throws 키워드로 던져버리는 식으로 구성함

        - 발생한 예외에 대한 내용을 확인할 때는 getMessage() 메소드나 printStackTrace() 메소드를 많이 사용한다.

     */

    public static void main(String[] args)
    {
        Account account = new Account();

        account.deposit(10000);
        System.out.println(account.getBalence() + "원을 입금했습니다.\n");


        // 예외 발생
        try
        {
            // 잔고 금액보다 많은 금액을 인출 -> BalanceInsufficientException 발생
            account.withdraw(12000);
        }
        catch(BalanceInsufficientException e)
        {
            // getMessage() 메소드를 사용한 예외 메세지 확인법
            System.out.println("TroubleShooting 1. getMessage()");
            String message = e.getMessage();
            System.out.println(message);

            System.out.println();

            // printStackTrace() 메소드를 사용한 예외 메세지 확인법
            System.out.println("TroubleShooting 2. printStackTrace()");
            e.printStackTrace();
            
        }

    }

}
