package com.te.java.collection.list;
import java.util.HashSet;
import java.util.Scanner;

public class StudentTest1 {
	static Object o;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("for adding data press 1 else press 2");
		String string = (s1.next()).toLowerCase().trim();
		int temp1=0;
		for (int j = 0; j < string.length(); j++) {
			temp1 = temp1 + Character.getNumericValue(string.charAt(j));
		}
	
		int studentRollno;
		int studentMarks;
		String StudentName;
		String loacation;
		int age;

		HashSet  h= new HashSet();
		System.out.println();
		

		
		while(temp1==1) {
			System.out.println("enter id");
			studentRollno=s1.nextInt();
			
			System.out.println("enter marks");
			studentMarks=s1.nextInt();

			System.out.println("enter name");
			StudentName=s1.next();

			System.out.println("enter location");
			loacation=s1.next();

			System.out.println("enter age");
			age=s1.nextInt();
			h.add(new Student(studentRollno, studentMarks, StudentName, loacation, age) );
			
			System.out.println("for adding data press 1 else press 2");
			temp1 = s1.nextInt();
			
		}
		
		System.out.println(h);

	}
}