package com.college_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.college_2")
public class CollegeConfig {
	
	/* agr hum @Bean annotation main ko koi name nhn de rahy to by default ye method ka naam bean 
	   id bna de ga. Or han ye zaroor yaad rakhni hy k agr hm @Bean annotaion use kr rahy hn to  
	   hmen @ComponentScan annontation us krne ki zaroorat nhn. Or classes k oper @Component annotation
	   dene ki bhi zaroorat nhn */
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	//@Bean(name="colBean")
	/*@Bean					// Agr hm constructor injection use kr rahy hen is trha hoga
	public College collegeBean() {		
		return new College(principalBean());
	}*/
	
	@Bean					// Agr hm setter injection use kr rahy hen to is trah hoga
	public College collegeBean() {
		College college = new College();
		college.setPrincipal(principalBean());
		return college;
	}
	
}
