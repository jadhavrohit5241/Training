package com.te.java.collection.list;

import javax.imageio.IIOException;
import javax.swing.text.AbstractDocument.ElementEdit;

public class TestAL {

	public static void main(String[] args) {
		Object[] object = new Object[10];
		object[0] = new IIOException("fef");
		object[1] = A.a;
		object[2] = E.EE;
	

		System.out.println(object[2]);
	}
}

interface A {
	static int a = 10;

}

enum E {
	EE,FF,GG;
	
	public  int test() {
			return 100;
	}
}
