package com.setter.di;

public class Student {
	
	private Integer id;
	private String studentName;
	
	public void setId(Integer id) {
		this.id = id;
		System.out.println("setter method call interally by IOC container : :setId");
	}

	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("setter method call interally by IOC container : :setStudentName");
	}

	void display() {
		System.out.println("Student name is : "+ studentName+" and the id is : "+id);
	}
}
