package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	public Integer saveEmployee(Employee employee);
	public Integer updateEmployee(Employee employee);
	public Integer deleteEmployee(Employee employee);
	public List<Employee> getAllEmployees();
}
