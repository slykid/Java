package com.java.kilhyun.OOP;

public class Student {

	public int studentId;
	public String name;
	public String addr;

    // 기본 생성자
	public Student() {}

	public Student(String inputName)
	{
		name = inputName;
	}

	// 사용자 지정 생성자
	public Student(int inputId, String inputName)
	{
		studentId = inputId;
		name = inputName;
	}

	// 오버로딩
	// - 같은 이름의 메소드 혹은 생성자이지만 매개변수를 달리하여 다양하게 사용하도록 하는 기능
	public Student(int inputId, String inputName, String inputAddr)
	{
		studentId = inputId;
		name = inputName;
		addr = inputAddr;
	}

    // 학생 정보 출력
    public void showStudentInfo()
    {
		System.out.println("학번 : " + studentId);
		System.out.println("학생명 : " + name);
		System.out.println("주소 : " + addr);
    }

    public String getStudentName()
    {
		return name;
    }

	@Override
	public boolean equals(Object obj)
	{
		// 다운 캐스팅을 위한 작업
		if(obj instanceof Student)
		{
			Student std = (Student)obj;
			return (this.studentId == std.studentId);
		}

		return false;
	}

	@Override
	public int hashCode()
	{
		// 일반적으로 equals 에서 활용했던 멤버를 사용하여 구현하면 됨
		return studentId;
	}
}
