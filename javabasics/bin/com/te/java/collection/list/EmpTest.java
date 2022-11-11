package com.te.java.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1=new Emp(10,"r");
		Emp emp2=new Emp(20,"z");
		Emp emp3=new Emp(30,"a");
		
		ArrayList<Emp> arrayList=new ArrayList<Emp>();
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.add(emp3);
		
		System.out.println("before sort");
		for (Emp emp : arrayList) {
			System.out.println(emp);
		}
		
		Collections.sort(arrayList);
		System.out.println("after sort");
		for (Emp emp : arrayList) {
			System.out.println(emp);
		}
	}

}
