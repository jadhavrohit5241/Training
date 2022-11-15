package com.te.java.collection.list;

public class Student implements Comparable{

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
	
		return "\t"+ this.studentRollno +" "+" " + this.StudentName + " \t " + this.age + " \t " + this.loacation + " \t"
				+ this.studentMarks + "";
	}

	@Override
	public int hashCode() {
		
		return this.studentRollno;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student s=(Student)obj;
		if (this.studentRollno == s.studentRollno) {
			try {
				throw new InvalidUserInputException(" \n DATA INERTION OPERATION FAILED \n  ROLL NUMBER  SHOULD BE UNIQUE ") ;
			} catch (InvalidUserInputException e) {
				// TODO Auto-generated catch block
				
				System.out.println(e.getMessage());
			}
			return false;}
		else{
			return true;}
	}

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
}
