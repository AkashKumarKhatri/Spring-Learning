package com.di;

public class UfonePK {
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}
}
