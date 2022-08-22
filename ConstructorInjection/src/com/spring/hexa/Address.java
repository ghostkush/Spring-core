package com.spring.hexa;

public class Address {
	private String addressln1, city, state, country;
	
	public Address(String addressln1, String city, String state, String country) {
		super();
		this.addressln1 = addressln1;
		this.city =city;
		this.state = state;
		this.country =country;
	}
	public String toString() {
		return  addressln1+" "+city+" "+state+" "+country;
	}
}
