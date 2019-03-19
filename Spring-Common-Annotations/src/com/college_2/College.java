package com.college_2;

/* ager hum @Component k ander bean id ka name nhn likhty to wo by defaul class ka naam d deta hy
   but us ka 1st letter small hoga example agr class College hy to ka object college bne ga. */

//@Component
public class College {

	private Principal principal;
	
	/*public College(Principal principal) {
		this.principal = principal;
	}*/

	public void test() {
		principal.principalInfo();
		System.out.println("Testing this method");
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
}
