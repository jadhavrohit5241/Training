package com.te.java.singleton;

public class Mysinglton {
	public static Mysinglton o1 = null;

	public static Mysinglton getSinglton() {

		if (o1 == null) {
			return new Mysinglton();
		} else {
			return o1;
		}
	}

	private Mysinglton() {
		// TODO Auto-generated constructor stub
	}

}
