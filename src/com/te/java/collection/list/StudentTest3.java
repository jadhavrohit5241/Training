package com.te.java.collection.list;

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest3 {
	static Object o;
	static int preRollno;

	public static void main(String[] args) throws InputMismatchException {
		// TODO Auto-generated method stub4

		System.out.println("\n >> > > W E L  C O M E    T O    S T U D E N T     D A T A B A S E < < << \n");

		Scanner s1 = new Scanner(System.in);
		System.out.println("FOR ADDING DATA PRESS 1|YES \n ELSE PRESS 0|NO");
		String string = (s1.next()).toLowerCase().trim();
		int temp1 = 0;
		for (int j = 0; j < string.length(); j++) {
			temp1 = temp1 + Character.getNumericValue(string.charAt(j));
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////
		int studentRollno;
		int studentMarks;
		String StudentName;
		String loacation;
		int age;
		int[] arr = new int[1000];
		int count = 0;
		HashSet h = new HashSet();
		System.out.println();
		while (temp1 == 1) {
			System.out.println("ENTER STUDENT ID :-");
			studentRollno = s1.nextInt();
			
			for (int i = 0; i <count; i++) {
				if (arr[i] == studentRollno) {
					try {
						throw new InvalidUserInputException(" ENTER UNIQUE ROLL NUMBER PLEASE ");
					} catch (InvalidUserInputException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println(e.getMessage());
					}

				} else {
					arr[count] = studentRollno;
					count++;
				}
			}

			System.out.println("ENTER STUDENT MARKS :-");
			studentMarks = s1.nextInt();

			System.out.println("ENTER STUDENT NAME :-");
			StudentName = s1.next();

			System.out.println("ENTER STUDENT LOCATION :-");
			loacation = s1.next();

			System.out.println("ENTER STUDENT AGE :-");
			age = s1.nextInt();
			h.add(new Student(studentRollno, studentMarks, StudentName, loacation, age));

			System.out.println("FOR ADDING MORE RECORDS PRESS 1 ESLE 0");
			temp1 = s1.nextInt();

		}

		ArrayList<Student> arrayList1 = new ArrayList<Student>(h);
		System.out.println();
/////////////////////////////////////////////////////////////////////////////////////////////		

		int i = 1;
		int counter = 0;
		String s = "";
		while (i == 1) {

			Scanner sc = new Scanner(System.in);
			i = 0;

			System.out.println(" \n ");
			System.out.println("\t--:KINDLY  SELECT  SORTING  ORDER:--");
			System.out.println();
			System.out.println(" \t PRESS 1 FOR SORT BY NAME");
			System.out.println(" \t PRESS 2 FOR SORT BY ROLL NUMBER");
			System.out.println(" \t PRESS 3 FOR SORT BY MARKS ");
			System.out.println(" \t PRESS 4 FOR SORT BY AGE ");

			s = (sc.next()).toLowerCase().trim();

			for (int j = 0; j < s.length(); j++) {
				i = i + Character.getNumericValue(s.charAt(j));
			}

			if (i < 1 || i > 4) {
				counter++;
				if (counter == 3) {
					System.out.println("*******  T H A N K   Y O U   ******* \n *please try after some time");
					counter = 0;
					break;
				}

				try {
					throw new InvalidUserInputException(
							"  NOTE: \n \t PLEASE ENTER VALID INPUT \n \t YOU INPUT SHOULD LIE BETWEEN 1 TO 4 ONLY");
				} catch (InvalidUserInputException e) {
					// TODO: handle exception

					System.out.println(e.getMessage());
				}
			}

			if (i == 1) {
				Collections.sort(arrayList1, new StudentName());
				System.out.println();
				System.out.println("\t----SORTED by STUDENT NAME------");
				System.out.println();
				System.out
						.println("  " + " |ROLL.NO|" + "| N A M E" + " " + "|" + "| AGE |" + "| LOC |" + "|PERCENT| ");
				for (Iterator iterator = arrayList1.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}

			} else if (i == 2) {
				Collections.sort(arrayList1, new StudentRollno());
				System.out.println("\t----SORTED by ROLL NUMBER------");
				System.out.println();
				System.out
						.println("  " + " |ROLL.NO|" + "| N A M E" + " " + "|" + "| AGE |" + "| LOC |" + "|PERCENT| ");
				for (Iterator iterator = arrayList1.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}

			} else if (i == 3) {
				Collections.sort(arrayList1, new StudentsMarks());
				System.out.println("\t----SORTED by STUDENT MARKS------");
				System.out.println();
				System.out
						.println("  " + " |ROLL.NO|" + "| N A M E" + " " + "|" + "| AGE |" + "| LOC |" + "|PERCENT| ");
				for (Iterator iterator = arrayList1.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}

			} else if (i == 4) {
				Collections.sort(arrayList1, new StudentAge());
				System.out.println("\t----SORTED by STUDENT AGE------");
				System.out.println();
				System.out
						.println("  " + " |ROLL.NO|" + "| N A M E" + " " + "|" + "| AGE |" + "| LOC |" + "|PERCENT| ");
				for (Iterator iterator = arrayList1.iterator(); iterator.hasNext();) {
					System.out.println(iterator.next());
				}
			} else {

			}

			int i2 = 0;
			int innerloopcontrol = 0;
			while (innerloopcontrol == 0) {
				System.out.println();
				System.out.println(" \t FOR  MORE  PRESS  YES| 1 \n \t  ELSE  PRESS \t NO| 0 ");

				s = (sc.next()).toLowerCase().trim();
				for (int j = 0; j < s.length(); j++) {
					i2 = i2 + Character.getNumericValue(s.charAt(j));
				}

				if (i2 != 0 && i2 != 1 && i2 != 47 && i2 != 76) {
					counter++;
					if (counter == 3) {
						System.out.println("\t*******  T H A N K   Y O U   ******* ");
						try {
							innerloopcontrol = 1;
							throw new InputCountExpired(
									" \t User Running out of INPUT chance \n \t *please try after some time*");
						} catch (InputCountExpired e) {
							System.out.println(e.getMessage());

						}

						break;
					}

					try {
						throw new InvalidUserInputException(
								"  NOTE: \t \n \t PLEASE ENTER VALID INPUT \n \t YOU INPUT SHOULD LIE BETWEEN 1 TO 0 ONLY");
					} catch (InvalidUserInputException e) {
						// TODO: handle exception
						System.out.println(e.getMessage());
					}

				} else if (i2 == 0 || i2 == 47) {
					i = 0;
					System.out.println();
					System.out.println("\t*******  T H A N K   Y O U   *******");
					break;
				} else if (i2 == 1 || i2 == 76) {
					break;
				}

			}

			if (innerloopcontrol == 1) {
				break;
			} else if (i2 == 0 || i2 == 47) {
				break;
			} else {
				i = 1;
			}

		}

		System.out.println(arr);
	}

}
