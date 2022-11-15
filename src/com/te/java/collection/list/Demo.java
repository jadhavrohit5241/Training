package com.te.java.collection.list;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myarraylist myarraylist=new Myarraylist();
		myarraylist.add("wef1000");
		myarraylist.add("vdd1000");
		myarraylist.add("10bdbf00");
		myarraylist.add("v1000");
		myarraylist.add(true);
		myarraylist.size();
		
	
		
		Iterator iterator = myarraylist.iterator();
				while (iterator.hasNext()) {
					 System.out.println(iterator.next());
					
				}
		
	
		System.out.println("--------------------------------------------------");
	    System.out.println(myarraylist.toString());
	}
}
