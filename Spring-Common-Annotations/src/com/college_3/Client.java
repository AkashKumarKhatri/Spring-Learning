package com.college_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		//ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class); OR
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is : "+college);
		college.test();
		context.close();
		//((AnnotationConfigApplicationContext)context).close(); // Agr hum ApplicationContext use kr rahy hon us condition main hmen casting krn krn prti hy wrna nhn.
	}
}
