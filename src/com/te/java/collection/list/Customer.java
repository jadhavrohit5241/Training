package com.te.java.collection.list;

public class Customer  {
	int Id;
	String Name;

	public Customer(int a,String s) {
		// TODO Auto-generated constructor stub
		this.Id=a;
		this.Name=s;
	}
	
	
	
	
	public String toString() {
		// TODO Auto-generated method stub
	
		return this.Id+this.Name ;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.Id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
