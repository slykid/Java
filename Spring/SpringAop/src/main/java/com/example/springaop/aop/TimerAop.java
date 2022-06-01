package com.example.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAop {

    @Pointcut("execution(* com.example.springaop.controller..*.*(..))")
    private void cut() {}

    @Pointcut("@annotation(com.example.springaop.annotation.Timer)")
    private void enableTimer() {}

    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{

        // 런타임 계산을 위한 스톱워치 객체 생성
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();

        stopWatch.stop();

        // 런타임 소요시간 출력
        System.out.println("total runtime : " + stopWatch.getTotalTimeSeconds());

    }

}
