package com.te.java.string;

import java.util.Iterator;

public class RverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mynameis";
		System.out.println(s);
		String s1="";
		//reverse using loop
		for (int i = (s.length()-1); i >=0; i--) {
			s1=s1+s.charAt(i);
			
		}
		System.out.println(s1);
	}

}
