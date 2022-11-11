package com.te.java.singleton;

public class Test {
	public static void main(String[] args) {
	
		Mysinglton m1 = Mysinglton.getSinglton();
		Mysinglton m3 = Mysinglton.getSinglton();
		Mysinglton m2 = Mysinglton.getSinglton();
		System.out.println(m1 == m2);
		System.out.println(m3 == m2);
		System.out.println(m1 == m3);
	}
}
