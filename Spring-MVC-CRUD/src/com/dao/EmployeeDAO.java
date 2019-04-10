package com.dao;

import java.util.List;

import com.model.EmployeeBean;

public interface EmployeeDAO {
	Integer addEmployee(EmployeeBean employeeBean);
	Integer updateEmployee(EmployeeBean employeeBean);
	Integer deleteEmployee(Integer empId);
	List<EmployeeBean> getAllEmployees();
	EmployeeBean getEmployeeById(Integer employeeId);
}
