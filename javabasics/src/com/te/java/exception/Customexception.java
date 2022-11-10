package com.te.java.exception;


public class Customexception extends RuntimeException  {
    String message;
    
	public Customexception(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		
	}
	// @overide
//	public String getMessageString() {
//		return this.message;
//		
//	}
}
