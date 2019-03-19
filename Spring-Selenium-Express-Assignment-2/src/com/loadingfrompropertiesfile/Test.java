package com.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCConnection connection = context.getBean("jdbcConnection", JDBCConnection.class);
		connection.display();
		connection.getConnection();
	}
}
