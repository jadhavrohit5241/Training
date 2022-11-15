package com.te.java.collection.set;

import java.util.Comparator;

public class CustomTreetest implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1=o1.toString();
		String s2=o2.toString();
//		
//		return s1.compareTo(s2);
//		//or -(s1.CompareTp(s2))
//		
//		
		int l1=s1.length();
		int l2=s2.length();
		if (l1<l2) {
			return -1;
			
		} else if(l1>l2) {
			return 1;
		}else {
			return s1.compareTo(s2);
		}
		
		
		
		
		
		
		
	}

}
