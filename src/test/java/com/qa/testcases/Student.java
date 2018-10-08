package com.qa.testcases;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {

		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int getSumOfMarks() {

		int sum = 0;

		for (int mark : marks) {
			sum = sum + mark;

		}

		return sum;
	}

}
