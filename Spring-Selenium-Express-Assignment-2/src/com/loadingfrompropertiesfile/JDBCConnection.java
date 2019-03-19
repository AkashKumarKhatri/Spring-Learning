package com.loadingfrompropertiesfile;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.username}")
	private String userName;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.driver}")
	private String driver;
	
	public void display() {
		System.out.println("URL : "+url+" : Username : "+userName+" : "+
					"Password : "+password+" : Driver : "+driver);
	}
	
	public void getConnection() throws Exception {
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Successfull : "+connection);
	}
	
}
