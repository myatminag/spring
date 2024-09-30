package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class MyClient {

	@Autowired
	private MyService service;

	public void showMessage() {
		System.out.println(service.getMessage());
	}
}
