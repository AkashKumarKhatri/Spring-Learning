package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class ClientAdvance {
	public static void main(String[] args) {
		
		/* 
		 * ApplicationContext container is creates object XML loading so can say Application is 
		 * Eager Container
		 */ 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Object object = context.getBean("t");
		
		Test test = (Test) object;
		test.hello();
		
	}
}
