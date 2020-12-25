package com.java.kilhyun.OOP;

import java.lang.reflect.Method;

public class ex11_PrintAnnotationTest {

    public static void main(String[] args)
    {
        // Service 메소드 정보 획득
        Method[] declaredMethods = ex11_Service.class.getDeclaredMethods();

        // Method 객체를 1개씩 처리
        for(Method method : declaredMethods)
        {
            // PrintAnnotation 적용여부 확인
            if(method.isAnnotationPresent(PrintAnnotation.class))
            {
                // PrintAnnotation 객체 획득
                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                // 메소드 명 출력
                System.out.println("[" + method.getName() + "] ");

                // 구분선 출력
                for(int i = 0; i < printAnnotation.number(); i++)
                {
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try
                {
                    // 메소드 호출
                    method.invoke(new ex11_Service());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                System.out.println();
            }
        }
    }
}
