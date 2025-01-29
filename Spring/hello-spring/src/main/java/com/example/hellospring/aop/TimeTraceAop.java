/**
 * packageName  : com.example.hellospring.aop
 * fileName     : TimeTraceAop
 * author       : kilhyunkim
 * date         : 25. 1. 29.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 29.          kilhyunkim         최초작성
 */
package com.example.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {

    @Around("execution(* com.example.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable
    {
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());

        try
        {
            return joinPoint.proceed();
        }
        finally
        {
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("END: " + joinPoint.toString() + " " + duration + "ms");
        }

    }

}
