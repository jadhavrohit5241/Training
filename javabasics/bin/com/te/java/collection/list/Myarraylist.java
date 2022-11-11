package com.te.java.collection.list;


import java.util.Arrays;
import java.util.Iterator;

public class Myarraylist implements Iterable{

	private static int count;
	private Object a[] = new Object[1];

	public void add(Object o) {
		if (count < this.a.length) {
			grow();
		}
		a[count] = (o);
		count++;

	}

	public Object get(int aa) {
		if (aa > count) {
			throw new IndexOutOfBoundsException();
		} else {
			return a[aa];
		}

	}

	public int size() {
		return this.count;

	}

//	@Override
//	public String toString() {
//		String temp="";
//		
//		for ( int i=0 ;i<count;i++) {
//	
//			temp=temp+","+a[i];
//		}
//		
//		String s="[ "+temp+"]" ;
//		return s;
//	}
//	

	@Override
	public String toString() {
		String s = "[ " + a[0];
		if (size() == 0 ) {
			for (int i = 1; i < size(); i++) {
				s = s + "," + a[i];
			}
		}
		s += " ]";
		return s;
	}

	private void grow() {
		Object[] tempObjects = new Object[(this.a.length + 10)];
		System.arraycopy(this.a, 0, tempObjects, 0, count);
		a = tempObjects;
	}

	

	private class Myitr implements Iterator {
		private int index;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			
			return (index<count)?true:false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return a[index++] ;
		}

	}



	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new Myitr();
	}
	
	
	

}

