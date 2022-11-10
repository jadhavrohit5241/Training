package com.te.java.collection;

import java.lang.reflect.Method;

public class Myarraylist {
	
	private static int count;
	private Object a[]=new Object[1];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myarraylist myarraylist=new Myarraylist();
		myarraylist.add("wef1000");
		myarraylist.add("vdd1000");
		myarraylist.add("10bdbf00");
		myarraylist.add("v1000");
		myarraylist.add(true);
		myarraylist.size();
	    System.out.println(myarraylist.get(4));
	}
	
	
	public  void add(Object o) {
		if (count<this.a.length) {
			grow();
		}
		a[count]=(o);
		count++;
		
	}
	
	public Object get(int aa) {
		if(aa>count){
			throw new IndexOutOfBoundsException();
		}
		else{
		return a[aa];
		}
		
	}
	public int size() {	
		return this.count;
		
	}
	
	private void grow () {
		Object[]tempObjects=new Object[(this.a.length+10)];
		System.arraycopy(this.a,0, tempObjects, 0, count);
		a=tempObjects;		
	}
}
