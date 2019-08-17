package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	private String driver;
	private String url;
	private String userName;
	private String password;
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setting driver..");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setting url..");
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setting password..");
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setting userName..");
		this.userName = userName;
	}
	
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside the custom init method");
		createStudentDBConnection();
	}

	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Creating connection..");
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, password);
	}
	
	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		System.out.println("Retriving all students data ");
		
		//createStudentDBConnection();
		
		Statement stmt = con.createStatement();
		ResultSet set = stmt.executeQuery("select * from student");
		while (set.next()) {
			int studentId = set.getInt(1);
			String name = set.getString(2);
			String rollNo = set.getString(3);
			String contact = set.getString(4);
			
			System.out.println(studentId + " " + name + " " + rollNo + " " + contact);
		}
	}
	
	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from student where student_id = " + studentId);
		System.out.println("Record deleted with id " + studentId);
	}
	
	public void closeConnection() throws SQLException {
		System.out.println("Inside closeConnection method..");
		con.close();
	}
	
	//@PreDestroy
	public void destroy() throws SQLException {
		System.out.println("Inside destroy method..");
		closeConnection();
	}
	
	
}
