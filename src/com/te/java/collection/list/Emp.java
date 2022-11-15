package com.te.java.collection.list;

public class Emp implements Comparable {
	int empId;
	String empName;
	
	public Emp(int a,String s) {
		this.empId=a;
		this.empName=s;	
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empName+" "+this.empId;
	}
	
	

	
}
