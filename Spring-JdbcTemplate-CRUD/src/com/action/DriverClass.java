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
	
	// Below is under work
	
/*	System.out.println("Inserting employee!!");
	Employee newEmp1 = new Employee(1, "John");
	Employee newEmp2 = new Employee(2, "ASB"); dao.inserEmployeeDetails(newEmp1); 
	dao.inserEmployeeDetails(newEmp2); 
	 printEmployees(dao.getAllEmployees()); 

	System.out.println("Updating employee!!");
	newEmp1.setName("Mark");
	dao.updateEmployee(newEmp1);
	printEmployees(dao.getAllEmployees()); 

	System.out.println("Deleting employee Code 1");
	dao.deleteEployee(1);
	printEmployees(dao.getAllEmployees()); 
	}

	public static void printEmployees(List<Employee> empList){    
	for(Employee emp : empList) {        
	System.out.println(emp.toString());*/
}
