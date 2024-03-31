package com.java.kilhyun.OOP;

public class Student8 {
    public enum Sex {MALE, FEMALE};
    public enum City {SEOUL, BUSAN};

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student8(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student8(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() {
        return sex;
    }

    public City getCity() {
        return city;
    }
}
