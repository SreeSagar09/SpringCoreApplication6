package com.app;

public class Employee {
	private String empId;
	private String empName;
	private Integer age;
	private String designation;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(String empId, String empName, Integer age, String designation, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.designation = designation;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", designation=" + designation
				+ ", address=" + address + "]";
	}
	
}
