package com.treemap;

public class Employee implements Comparable<Employee> {

	int id;
	String e_name;
	String d_name;
	int salary;

	public Employee(int id, String e_name, String d_name, int salary) {
		super();
		this.id = id;
		this.e_name = e_name;
		this.d_name = d_name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", e_name=" + e_name + ", d_name=" + d_name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return e.id-this.id;
	}

}
