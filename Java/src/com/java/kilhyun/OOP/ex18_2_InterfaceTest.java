package com.java.kilhyun.OOP;

import java.io.IOException;

public class ex18_2_InterfaceTest {
    /*
    Quiz
    고객 센터에는 전화 상담원들이 있다.
    - 먼저 고객센터로 전화가 오면 대기열에 저장된다.
    - 이 후 상담원이 지정하기 전까지는 대기상태가 된다.
    - 각 전화가 상담원에게 배분되는 정책은 아래와 같이 구현될 수 있다.
        - 상담원 순서대로 배분
        - 대기가 짧은 상담원 먼저 배분
        - 우선순위가 높은(숙련도가 높은) 상담원에게 먼저 배분

    위의 내용을 interface 를 사용해서 정의하고, 다양한 정책을 구현해 실행하시오.
     */

    public static void main(String[] args) throws IOException
    {
        // 스케쥴링 선택
        System.out.println("전화 상담원 할당방식을 선택하세요");
        System.out.println("R: 한 명씩 차례로");
        System.out.println("L: 대기가 적은 상담원 우선");
        System.out.println("P: 우선순위가 높은 고객우선 숙련도 높은 상담원");

        // 입력 변수 선언
        int ch = System.in.read();

        // 스케쥴링 변수 선언
        Scheduler schedule = null;

        // 스케쥴링 설정
        if (ch == 'R' || ch == 'r')
        {
            schedule = new RoundRobin();
        }
        else if (ch == 'L' || ch == 'l')
        {
            schedule = new LeastJob();
        }
        else if (ch == 'P' || ch == 'p')
        {
            schedule = new PriorityAllocation();
        }
        else
        {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        // 설정된 스케쥴링 수행
        schedule.getNextCall();
        schedule.sendCallToAgent();

    }

}
