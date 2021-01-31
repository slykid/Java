package com.java.kilhyun.OOP;

public class ex22_1_ExceptionTest {
    /*
        오류
        - 시스템 오류: 가상 머신에서 발생하며, 프로그래머가 처리할 수 없음
          - 동적 메모리를 다 사용한 경우, Stack Overflow 등의 경우가 대표적임

        - 예외: 프로그램에서 제어할 수 있는 오류를 의미함
          - 읽으려는 파일이 존재하지 않는 경우. 소켓의 연결이 잘못된 경우 등이 있음

        - 컴파일 오류: 프로그램 코드 작성 중 발생하는 문법적 오류
        - 실행 오류: 실행 중인 프로그램이 의도하지 않은 동작을 하는 경우(bug), 프로그램이 중지되는 경우 (runtime error)

        - 자바에서는 예외처리를 통해 프로그램의 비정상적인 종료를 막고 로그를 남길 수 있음

        Exception 클래스
        - 예외처리와 관련된 자바의 최상위클래스
        - Exception 클래스에는 크게 입출력에 대한 예외처리와 실행오류에 대한 예외처리 부분으로 나눌 수 있다.

        try - catch 구문
        - 예외 처리를 하기 위한 구문
        - 예외를 발생시키는 부분인 try 블록과 예외가 발생했을 때 처리할 부분인 catch 블록으로 구성됨
        - 필요에 따라 finally 와 같은 구문이 붙을 수 있음
        - 형태
          try {
              예외 발생 코드 부분
          } catch(처리할 예외타입 e) {
             try 블록 내의 예외가 발생 시, 처리 방법
          }

        - finally 구문는 예외 발생 여부와 상관 없이 항상 수행되는 부분을 작성함

     */

    public static void main(String[] args)
    {
        // 1. try - catch 구문
        int[] arr = new int[5];

        // Exception 의 내용 확인 시, 아래의 try 내 부분을 제외한 나머지는 주석처리할 것
        // 해당 부분을 실행할 경우 배열의 길이를 넘어서기 때문에, ArrayIndexOutOfBoundsException 이 발생함
        try
        {
            for (int i = 0; i <= 5; i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
            System.out.println("예외처리");
        }
        System.out.println("프로그램 종료");
        
    }

}
