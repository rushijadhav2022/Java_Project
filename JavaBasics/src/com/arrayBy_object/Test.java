package com.arrayBy_object;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

}

public class Test {

	public static void main(String[] args) {

		Employee[] emp = new Employee[3];

		emp[0] = new Employee(101, "Sachin", 45000);
		emp[1] = new Employee(102, "Rohan", 65000);
		emp[2] = new Employee(103, "Ram", 75000);
		
		System.out.println("---------------------------------------");
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		
		System.out.println("------------------------------------------");
		
		for(Employee e : emp)
		{
			System.out.println(e);
		}

	}

}
