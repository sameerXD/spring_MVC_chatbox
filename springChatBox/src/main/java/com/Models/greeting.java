package com.Models;

public class greeting {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public greeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public greeting(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "greeting [name=" + name + "]";
	}
	
	
	

}
