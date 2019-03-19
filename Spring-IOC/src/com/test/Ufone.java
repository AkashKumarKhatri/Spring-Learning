package com.test;

public class Ufone implements Sim {
	
	public Ufone() {
		System.out.println("Ufone Constructor");
	}	
	
	@Override
	public void calling() {
		System.out.println("Hello There Is ufone calling method");
	}

	@Override
	public void data() {
		System.out.println("Hello There Is ufone data method");
	}

}
