package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 UfonePK ufonePK = context.getBean("ufone", UfonePK.class);
		 ufonePK.activateService();
	}
}
