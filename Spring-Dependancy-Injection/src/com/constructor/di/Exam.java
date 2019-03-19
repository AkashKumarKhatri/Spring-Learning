package com.constructor.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		
		/*Student student = new Student(1, "Akash Khatri");
		student.display();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-di.xml");
		System.out.println("Config Loaded");
		Student student = context.getBean("student", Student.class);
		student.display();
		
		Student dilip = context.getBean("dilip", Student.class);
		dilip.display();
		
		
		
		
		
		
	}
}
