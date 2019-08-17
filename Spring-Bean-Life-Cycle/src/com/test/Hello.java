package com.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


// This approach is not recommended 

public class Hello implements InitializingBean, DisposableBean {

	/*
	 * public void init() { System.out.println("inside init method"); }
	 * 
	 * public void destroy() { System.out.println("inside destroy method"); }
	 */
	
	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy method");
	}

	public void sample() {
		System.out.println("my coding start from here and ends here..");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside after properties set method");
	}

}
