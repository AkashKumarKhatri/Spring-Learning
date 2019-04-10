package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dao.EmployeeDAO;
import com.model.EmployeeBean;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer addEmployee(EmployeeBean employeeBean) {
		String sql = "insert into employees (name, salary, desination) values (?, ?, ?)";
		Object[] params = new Object[] {employeeBean.getName(), employeeBean.getSalary(), employeeBean.getDesination()};
		int[] types = new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR};
		return this.jdbcTemplate.update(sql, params, types);
	}

	@Override
	public Integer updateEmployee(EmployeeBean employeeBean) {
		String sql = "update employees set name = ?, salary = ?, desination = ? where employee_id = ?";
		return this.jdbcTemplate.update(sql, employeeBean.getName(), employeeBean.getSalary(), employeeBean.getDesination(), employeeBean.getEmployeeId());
	}

	@Override
	public Integer deleteEmployee(Integer empId) {
		String sql = "delete from employees where employee_id = ?";
		return this.jdbcTemplate.update(sql, new Object[] {empId});
	}

	@Override
	public List<EmployeeBean> getAllEmployees() {
		String sql = "select * from employees";
		return (List<EmployeeBean>) this.jdbcTemplate.query(sql, new RowMapper<EmployeeBean>(){

			@Override
			public EmployeeBean mapRow(ResultSet rs, int arg1) throws SQLException {
				EmployeeBean employeeBean = new EmployeeBean();
				employeeBean.setEmployeeId(rs.getInt("employee_id"));
				employeeBean.setName(rs.getString("name"));
				employeeBean.setSalary(rs.getInt("salary"));
				employeeBean.setDesination(rs.getString("desination"));
				return employeeBean;
			}
			
		});
	}

	@Override
	public EmployeeBean getEmployeeById(Integer employeeId) {
		 String sql = "select * from employees where employee_id = ?";    
		 return this.jdbcTemplate.queryForObject(sql, new Object[]{employeeId}, new BeanPropertyRowMapper<EmployeeBean>(EmployeeBean.class)); 
	}

}
