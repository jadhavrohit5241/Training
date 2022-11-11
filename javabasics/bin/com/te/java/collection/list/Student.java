package com.te.java.collection.list;

public class Student{

	int studentRollno;
	int studentMarks;
	String StudentName;
	String loacation;
	int age;

	public Student(int a, int m, String name, String loc, int age) {
		this.studentRollno = a;
		this.studentMarks = m;
		this.StudentName = name;
		this.loacation = loc;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return this.studentRollno + " " + this.StudentName + " \t " + this.age + " \t " + this.loacation + " \t"
				+ this.studentMarks + "";
	}

	

	
}
