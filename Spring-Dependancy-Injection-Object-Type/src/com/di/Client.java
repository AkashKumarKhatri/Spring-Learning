package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		/*Student student = new Student();
		MathCheat cheat = new MathCheat();
		student.setMathCheat(cheat);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("setter-di.xml");
		System.out.println("setter-di.xml loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();
		
		AnotherStudent anotherStudent = context.getBean("anotherStudent", AnotherStudent.class);
		anotherStudent.startCheating();
	}
}
