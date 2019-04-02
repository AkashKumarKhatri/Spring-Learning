package com.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDAO;
import com.dao.impl.EmployeeDAOImpl;
import com.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO employeeDAO = context.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
		List<Employee> employees = employeeDAO.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeId()+" "+employee.getName()+" "+employee.getAge());
		}
	}
}
