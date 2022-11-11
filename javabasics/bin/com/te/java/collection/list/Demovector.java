package com.te.java.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demovector {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add(54654);
		vector.add("eg");
		vector.addElement(1000);

		Enumeration e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		for (Iterator iterator = vector.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

		for (ListIterator iterator2 = vector.listIterator(); iterator2.hasNext();) {
			Object object1 = (Object) iterator2.next();
			System.out.println();
		}

	}
}
