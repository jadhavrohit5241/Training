package com.te.java.collection.set;

import java.util.TreeSet;

public class CustomTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TreeSet t = new TreeSet(new CustomTreetest());
		t.add("sss");
		//t.add("dd");
		t.add("eeehh");
		t.add("aaajhjbhb");
		t.add(500000);
		t.add(new StringBuffer("zzz"));
		t.add("kkk");
		t.add("lll");
		t.add(10);
		t.add(30.222222);
		

		System.out.println(t);
	}


}


// Stringbuffer
//t.add(new StringBuffer("a"));
//t.add(new StringBuffer("avv"));
//t.add(new StringBuffer("s"));
//t.add(new StringBuffer("z"));

//length;  and hetero
//t.add("sss");
//t.add("dd");
//t.add("eeehh");
//t.add("aaajhjbhb");
//t.add(500000);
//t.add(new StringBuffer("zzz"));
//t.add("kkk");
//t.add("lll");
//t.add(10);
//t.add(30);
