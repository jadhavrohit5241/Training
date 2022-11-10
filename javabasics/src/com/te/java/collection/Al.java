package com.te.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Al{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList ();

		a.add("kjbewbvu");
		a.add(10);
		a.add(20);
		a.add(10);
		for (Object e : a) {
			System.out.println(e);
			
		}
		
		for (Iterator iterator = a.iterator(); iterator.hasNext();) {
			
			System.out.println(iterator.next());
			
		}
		
		
		
		Iterator iterator1=a.listIterator();
		while (iterator1.hasNext()) {
		  System.out.println(iterator1.next());
			
		}
	

	}

}
