package com.test;

public class Telenor implements Sim {

	@Override
	public void calling() {
		System.out.println("Hello There Is Telenor calling method");
	}

	@Override
	public void data() {
		System.out.println("Hello There Is Telenor data method");
	}
	
}
