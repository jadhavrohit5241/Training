package com.te.java.singleton;

public class RuntimeDemo {

	public static void main(String args[]) {
		Runtime r = Runtime.getRuntime();
		System.out.println("total memory of the heap :" + r.totalMemory());
		System.out.println("free memory of the heap :" + r.freeMemory());
		for (int i = 0; i < 10000; i++) {
				/*   
				 * some
				 *     object 
				 *          creations
				 *   date d=new date();
				 * 
				 * */
		}
		System.out.println("free memory of the heap :" + r.freeMemory());
		r.gc();                 /////request if form but gc not called by jvm
		System.out.println("free memory of the heap :" + r.freeMemory());
	}
}
