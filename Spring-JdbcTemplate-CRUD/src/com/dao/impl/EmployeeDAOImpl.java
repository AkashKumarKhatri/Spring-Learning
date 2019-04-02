package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dao.EmployeeDAO;
import com.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private String sqlSelectAll = "select * from employees";
	private String sqlUpdate = "update employees set name = ?, age = ? where employee_id = ?";
	private String sqlInsert = "insert into employees (employee_id, name, age) values (?,?,?)";
	private String sqlDelete = "delete from employees where employee_id = ?";
	
	@Override
	public Integer saveEmployee(Employee employee) {
		Object[] params = new Object[] {employee.getEmployeeId(), employee.getName(), employee.getAge()};
		int[] types = new int[] { Types.INTEGER, Types.VARCHAR};
		return this.jdbcTemplate.update(sqlInsert, params, types);
	}

	@Override
	public Integer updateEmployee(Employee employee) {
		return this.jdbcTemplate.update(sqlUpdate, employee.getName(), employee.getAge(), employee.getEmployeeId());
	}

	@Override
	public Integer deleteEmployee(Employee employee) {
		return this.jdbcTemplate.update(sqlDelete, new Object[] {employee.getEmployeeId()});
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) this.jdbcTemplate.query(sqlSelectAll, new RowMapper<Employee>(){        
			@Override        
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {            
				Employee employee = new Employee();
				employee.setEmployeeId(rs.getInt("employee_id"));
				employee.setName(rs.getString("name"));
				employee.setAge(rs.getString("age"));
				return employee;        
			}    
			});
	}

}
