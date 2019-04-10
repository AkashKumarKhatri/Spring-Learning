package com.model;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer employeeId;
	private String name;
	private Integer salary;
	private String desination;
	
	public EmployeeBean() {
	
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDesination() {
		return desination;
	}

	public void setDesination(String desination) {
		this.desination = desination;
	}
}
