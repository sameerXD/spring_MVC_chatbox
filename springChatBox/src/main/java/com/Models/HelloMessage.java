package com.Models;

public class HelloMessage {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public HelloMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloMessage(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "greeting [name=" + name + "]";
	}
	
	

}
