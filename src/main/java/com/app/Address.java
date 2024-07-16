package com.app;

public class Address {
	private String houseNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	private Address() {
		super();
	}

	public Address(String houseNo, String area, String city, String state, String country, String zipCode) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipCode=" + zipCode + "]";
	}
	
}
