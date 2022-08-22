package com.spring.hexa;

// bean component
// POJO - class (plain old java object)
public class Student {
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void displayInfo() {
		System.out.println("Hello: "+ name);
	}
}
