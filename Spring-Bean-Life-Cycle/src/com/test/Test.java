package com.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);
		dao.selectAllRows();
		
		Hello hello = context.getBean("hello", Hello.class);
		hello.sample();
		
		((ClassPathXmlApplicationContext) context).close();
		
		/*
		 * StudentDAO dao = new StudentDAO(); dao.selectAllRows();
		 * dao.deleteStudentRecord(8);
		 */
	}

}
