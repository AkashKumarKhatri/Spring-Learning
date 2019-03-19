package com.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.interestedCoures}")
	private String interestedCoures;
	
	@Value("${student.hobby}")
	private String hobby;
	
	// agr hum @Value annotaion setter methods k bjae fields pe den to bhi same execution hogi koi changes nhn ae ga is liye maine setter methods ko comment kiya fields ko check krne k liye ye kam krti hn yaa nhn;
	
	/*@Required
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	//@Value("Spring") or Dynamic as below
	
	@Required
	@Value("${student.interestedCoures}")
	public void setInterestedCoures(String interestedCoures) {
		this.interestedCoures = interestedCoures;
	}

	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}*/
	
	public void displayInfo() {
		System.out.println("Student name : "+name);
		System.out.println("Student interested coures : "+interestedCoures);
		System.out.println("Student hobby : "+hobby);
	}
}
