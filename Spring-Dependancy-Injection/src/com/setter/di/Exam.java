package com.setter.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		
		/*Student student = new Student();
		student.setStudentName("Akash Khatri");
		student.display();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setter-di.xml");
		System.out.println("Config Loaded");
		Student student = context.getBean("student", Student.class);
		student.display();
		
		Student kumar = context.getBean("kumar", Student.class);
		kumar.display();
		
		
	}
}
