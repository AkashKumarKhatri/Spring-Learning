package com.constructor.di;

public class Student {
	
	private Integer id;
	private String studentName;
	
	public Student(Integer id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	public Student(Integer id) {
		this.id = id;
	}

	void display() {
		System.out.println("Student name is : "+ studentName+" and the id is : "+id);
	}
}
