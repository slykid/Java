package com.java.kilhyun.OOP;

public class Student3 {

    private String name;
    private int englishScore;
    private int mathScore;

    public Student3(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
