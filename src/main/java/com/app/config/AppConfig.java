package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Address;
import com.app.Employee;
import com.app.Student;

@Configuration
public class AppConfig {
	@Bean
	public Employee getEmployee() {
		Employee employee = new Employee("102", "Michel", 28, "Software Tester", getEmployeeAddress());
		return employee;
	}
	
	@Bean
	public Address getEmployeeAddress() {
		Address employeeAddress = new Address("450-90-1", "Gachibowli", "Hyderabad", "Telangana", "India", "506778");
		return employeeAddress;
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student("8099", "Lissa", 26, "Cyber Security", getStudentAddress());
		return student;
	}
	
	@Bean
	public Address getStudentAddress() {
		Address studentAddress = new Address("450-90-1", "Gachibowli", "Hyderabad", "Telangana", "India", "506778");
		return studentAddress;
	}
}
