package com.te.java.modifier.pack2;
import java.util.Arrays;
import static java.lang.Math.*;


import com.te.java.modifier.pack1.*;

public class Testpack2 extends Testpack1 {

	public static void main(String[] args) {
		Testpack2 testpack2=new Testpack2();
		// TODO Auto-generated method stub
	    Testpack1 testpack1=new	Testpack1();
	    testpack1.myPublicMethod();
	    testpack2.myProtectedMethod();
	    
	 
	    System.out.println(sqrt(10));
	    System.out.println(pow(5,2));
	 
	}

}
