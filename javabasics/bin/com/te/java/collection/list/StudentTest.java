package com.te.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.omg.CORBA.INTERNAL;

public class StudentTest {
	static Object o;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student0 = new Student(101, 65, "ADAM", "lA", 22);
		Student student1 = new Student(105, 50, "JOE", "PI", 23);
		Student student2 = new Student(104, 35, "REACH", "SS", 18);
		Student student3 = new Student(102, 85, "ROSS", "NY", 16);
		Student student4 = new Student(103, 90, "BARBIE", "NA", 20);
		Student student5 = new Student(107, 88, "CARLIE", "SC", 21);
		Student student6 = new Student(106, 76, "XYLOM", "CA", 15);

		ArrayList<Student> arrayList = new ArrayList<Student>();
		o=arrayList;
		arrayList.add(student6);
		arrayList.add(student2);
		arrayList.add(student1);
		arrayList.add(student3);
		arrayList.add(student0);
		arrayList.add(student5);
		arrayList.add(student4);

		System.out.println(">>>> > > W E L  C O M E    T O    S T U D E N T     D A T A B A S E < <<<<<<");
		int i=1;
		
		while (i==1) {
			
			Scanner sc = new Scanner(System.in);


			System.out.println(" \n ");
			System.out.println(" KINDLY  SELECT  SORTING  ORDER");
			System.out.println();
			System.out.println(" PRESS 1 FOR SORT BY NAME");
			System.out.println(" PRESS 2 FOR SORT BY ROLL NUMBER");
			System.out.println(" PRESS 3 FOR SORT BY MARKS ");
			System.out.println(" PRESS 4 FOR SORT BY AGE");
			try {
				i = sc.nextInt();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				
			}
			
			
			if (i!=1||i!=2||i!=3||i!=4) {
				try {
					throw new InvalidUserInputException("NOTE: \n PLEASE ENTER VALID INPUT \n \t YOU INPUT SHOULD LIE BETWEEN 1 TO 4 ONLY");
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println();
				}
			}
			
			
		if(i == 1) {
			Collections.sort(arrayList, new StudentName());
			System.out.println();
			System.out.println("----SORTED by STUDENT NAME------");
			System.out.println();
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}

		}
		if(i == 2) {
			Collections.sort(arrayList, new StudentRollno());
			System.out.println("----SORTED by ROLL NUMBER------");
			System.out.println();
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}

		}

		if(i == 3) {
			Collections.sort(arrayList, new StudentsMarks());
			System.out.println("----SORTED by STUDENT MARKS------");
			System.out.println();
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}

		}

		if(i == 4 ) {
			Collections.sort(arrayList, new StudentAge());
			System.out.println("----SORTED by STUDENT AGE------");
			System.out.println();
			for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}

			
			
		
		}
		System.out.println();
		System.out.println(" FOR MORE PRESS 1 \n ELSE PRESS 0");
		int i2=sc.nextInt();
		if(i2==0) {
			i=0;
			System.out.println();
			System.out.println("*******  T H A N K   Y O U   *******");
		
		}else {
			i=1;
		}
		
		}
		
		
	}

	

	
	
	
	
	
	
}
