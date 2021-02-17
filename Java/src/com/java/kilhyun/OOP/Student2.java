package com.java.kilhyun.OOP;

public class Student2 {

    public int sno;
    public String name;

    public Student2(int sno, String name)
    {
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Student2)
        {
            Student2 student = (Student2) obj;
            return (sno == student.sno) && (name.equals(student.name)); // 학번, 이름이 동일한 경우 true 반환
        }
        else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return sno + name.hashCode();  // 학번, 이름이 동일한 경우, 동일한 값으로 반환
    }
}
