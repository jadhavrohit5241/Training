package com.te.java.collection.list;

import javax.imageio.IIOException;

public class TestAL {

	public static void main(String[] args) {
		Object[] object = new Object[10];
		object[0] = new IIOException("fef");
		object[1] = A.a;
	

		System.out.println(object[1]);
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
