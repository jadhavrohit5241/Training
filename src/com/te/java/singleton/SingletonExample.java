package com.te.java.singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r1=Runtime.getRuntime();
		Runtime r2=Runtime.getRuntime();
		Runtime r3=Runtime.getRuntime();
		System.out.println(r1==r2);
		System.out.println(r3==r2);		
		System.out.println(r1==r1);
		System.out.println(r1.hashCode());
		System.out.println(r3);
		
		//methods to cummunicate with jvm 
		System.out.println(r2.totalMemory());
		System.out.println(r2.freeMemory());
		System.out.println(r2.totalMemory());
		
		
	}

}
