package com.te.java.string;
public class Occanrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "dmanbfaeuvkbaeiuebfewudbvoikajdnefiowkfegf2jgopa";
		char find = 'a';
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == find) {
				count++;
			}
		}
		System.out.println("occance of char '" + find + "' is " + count);
	}

}
