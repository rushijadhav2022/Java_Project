package com.getter_setter;

// This is java bin class

public class Employee {

	private int id; // Kept variables private
	private String name;
	private int salary;

	public void setId(int id) { // setter methods used to write the data
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() // Getter methods are used to read the data
	{
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

}
