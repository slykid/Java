package com.java.kilhyun.OOP;

import java.util.ArrayList;

class Animal
{
    public void move()
    {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal
{
    public void readBooks()
    {
        System.out.println("사람이 책을 읽습니다.");
    }

    public void move()
    {
        System.out.println("사람이 두발로 걷습니다.");
    }
}

class Tiger extends Animal
{
    public void hunting()
    {
        System.out.println("호랑이가 사냥을 합니다.");
    }

    public void move()
    {
        System.out.println("호랑이가 네 발로 뜀니다.");
    }
}

class Eagle extends Animal
{
    public void landing()
    {
        System.out.println("독수리가 나뭇가지에 앉습니다.");
    }

    public void move()
    {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class ex12_AnimalTest {

    public static void main(String[] args)
    {
        Animal hAnimal = new Human();
        Animal eAnimal = new Eagle();
        Animal tAnimal = new Tiger();

        // 정상 동작
        Human human1 = (Human) hAnimal;
        human1.readBooks();

        // 에러 발생
//        Eagle human2 = (Eagle) hAnimal; // 코드상으로는 에러가 없음 , but 컴파일 및 실행 시 에러발생

        // instanceof 로 객체타입 확인하기
//        if(hAnimal instanceof Eagle)
//        {
//            Eagle human2 = (Eagle) hAnimal;
//        }

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        ex12_AnimalTest test = new ex12_AnimalTest();
        test.testDowncasting(animalList);

        // 다형성 테스트
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

    }

    public void moveAnimal(Animal animal)
    {
        animal.move();
    }

    public void testDowncasting(ArrayList<Animal> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            Animal animal = list.get(i);

            if(animal instanceof Human)
            {
                Human human = (Human) animal;
                human.readBooks();
            }
            else if(animal instanceof Tiger)
            {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if(animal instanceof Eagle)
            {
                Eagle eagle = (Eagle) animal;
                eagle.landing();
            }
            else
            {
                System.out.println("error");
            }
        }
    }

}
