package com.te.java.singleton;

public class Gcexample2 {
	static Gcexample2 gcexample2;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Gcexample2 gcexample2 = new Gcexample2();
		System.out.println(gcexample2.hashCode());
		gcexample2 = null;
		System.gc();
		Thread.sleep(5000);
		gcexample2 = null;
		System.gc();     /*
		even though  object element eligible mutiple time but Gc called Gc only once */
		Thread.sleep(5000);
		System.out.println("main ends end of program");

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalize method");
		super.finalize();
	}
	 
	

}

/*
 * third party management tool for memory leaks
 * HP OVO
 * HP j Meter
 * JProbe
 * Patrol
 * IBM tivoli*/
