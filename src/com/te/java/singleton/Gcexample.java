package com.te.java.singleton;

public class Gcexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* String string=new String("mynew String");   
		 * string class finalize method called beacause string
		 * class finalize method contain empty emplimentauion
		 */
		Gcexample g=new Gcexample();
		g=null;    // making that object eligible for GC as assiing value as " null "
		/*
		 * here current class object eligible for gc so current class Finalixe method should be called  */
	
		System.gc();
		System.out.println("End of the main");
		}
	
	public void finalize() {
		System.out.println("hey thid method called by Gc");		
	}
}
