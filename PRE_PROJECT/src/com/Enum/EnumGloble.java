package com.Enum;

public enum EnumGloble {
	AA,BB,CC,DD,EE;
	
	
	public void info() {
		System.out.println(AA + " no arg ");
	}
	
	public void info(EnumGloble var) {
		System.out.println(var + " is Actual argumnets as contant ");
	}
	
	
	public static int returnInt() {
		return 10;
	}

}
