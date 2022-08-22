package com.spring.hexa;

public class Employee {
	private int id;
	private String name;
	private Address address;
	//default constructor
	public Employee() {}
	//parameterised constuctor
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address);
	}

}
