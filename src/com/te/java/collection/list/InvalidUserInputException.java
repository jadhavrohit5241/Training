package com.te.java.collection.list;

public class InvalidUserInputException extends Exception{
	public InvalidUserInputException(String s) {
		// TODO Auto-generated constructor stub
		super(s);	
	}
 
	public static void main(String[] args) {
		String s="yes";
		
		int i=0;
		s = s.toLowerCase().trim();

		for (int j = 0; j < s.length(); j++) {
			i = i + Character.getNumericValue(s.charAt(j));
		}
		System.out.println(i);
		
	}

}
