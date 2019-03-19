package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		
		/*Ufone ufone = context.getBean("ufone", Ufone.class);
		ufone.calling();
		ufone.data();
		
		Telenor telenor = context.getBean("telenor", Telenor.class);
		telenor.calling();
		telenor.data();*/
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
		
	}
}
