package com.java.kilhyun.OOP;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
    private List<Student8> list;

    public MaleStudent() {
        list = new ArrayList<Student8>();
        System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
    }

    public void accumulate(Student8 student) {
        list.add(student);
        System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
    }

    public void combine(MaleStudent obj) {
        list.addAll(obj.getList());
        System.out.println("[" + Thread.currentThread().getName() + "] combine()");
    }

    public List<Student8> getList() {
        return list;
    }

}
