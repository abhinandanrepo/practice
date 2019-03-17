package test.model;

import java.util.List;

public class Employee {

	private String name;
	private Integer age;
	private Double salary;
	private List<String> phoneNumber;

	public Employee(String name, Integer age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, Integer age, Double salary, List<String> phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}



	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// getters and setters for name and age attributes go here
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	// overridden equals() and hashcode() go here
	public String toString() {
		return "Employee Name: " + this.name + "  Age: " + this.age + "  Salary: " + this.salary;
	}
	
}
