package com.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("xml loaded");*/
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is : "+college);
		college.test();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
