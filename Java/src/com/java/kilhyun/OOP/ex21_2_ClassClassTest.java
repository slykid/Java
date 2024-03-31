package com.java.kilhyun.OOP;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ex21_2_ClassClassTest {

    /*
    1. Class 클래스
        자바의 모든 클래스, 인터페이스는 컴파일 후 .class 파일을 생성한다.
        .class 파일에는 객체의 정보(멤버 변수, 메소드, 생성자 등) 가 포함되어 있다.
        컴파일된 .class 파일에서 객체의 정보를 가져올 수 있다.
        주로 동적 로딩 시에 많이 사용된다.

     2. Reflection 프로그래밍
         Class 클래스로부터 객체의 정보를 가져와서 프로그래밍하는 방식
         로컬에 객체가 없기 때문에 자료형을 알 수 없는 경우에 유용함
         java.lang.reflect 패키지에 있는 클래스를 활용함
     */

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        // 1. 클래스 정보 가져오기
        String s = new String();
        Class c1 = s.getClass();

        Class c2 = String.class;

        Class c3 = Class.forName("java.lang.String"); // 동적 로딩: 해당 statement 가 실행될 때 로딩됨
                                                      // 장점: 원하는 클래스를 로딩할 수 있다.
                                                      // 단점: 잘못 기입할 경우, ClassNotFoundException 으로 인해 런타임시 종료됨
                                                      // ex. jdbc 로딩 시에 사용됨

        // 2. Reflection 프로그래밍
        Constructor[] cons = c3.getConstructors();

        for(Constructor con : cons)
        {
            System.out.println(con); // java 내에 해당 클래스와 연관된 모든 생성자가 출력됨
        }

        System.out.println();

        Method[] methods = c3.getMethods();

        for(Method method : methods)
        {
            System.out.println(method); // java 내에 해당 클래스와 연관된 모든 메소드가 출력됨
        }

        System.out.println();

        // 3. 예제
        Person person = new Person("James");
        System.out.println(person);

        Class c4 = Class.forName("com.java.kilhyun.OOP.Person");
        Person person1 = (Person)c4.newInstance();  // 동적 객체를 생성해주는 메소드
        System.out.println(person1);

        System.out.println();

        // 로컬에서 Person 타입을 사용하지 못하는 경우에 접근하는 방법
        Class[] parameterTypes = {String.class};
        Constructor cons1 = c4.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personKim = (Person) cons1.newInstance(initargs);
        System.out.println(personKim);

    }

}
