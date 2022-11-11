package com.te.java.collection.list;

import java.util.Comparator;

public class StudentsMarks implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentMarks-o2.studentMarks;
	}

}