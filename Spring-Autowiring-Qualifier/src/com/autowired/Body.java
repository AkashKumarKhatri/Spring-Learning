package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//System.out.println("xml loaded");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
	}
}
