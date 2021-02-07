package com.java.kilhyun.OOP;

public class ex23_2_MultiGenericTest {

    public static void main(String[] args)
    {
        Product<TV, String> product1 = new Product<TV, String>();
        product1.setKind(new TV());
        product1.setModel("스마트TV");
        TV tv = product1.getKind();
        String tvModel = product1.getModel();

        System.out.println(tvModel);

        System.out.println();

        Product<Car1, String> product2 = new Product<Car1, String>();
        product2.setKind(new Car1());
        product2.setModel("디젤");
        Car1 car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println(carModel);
    }

}
