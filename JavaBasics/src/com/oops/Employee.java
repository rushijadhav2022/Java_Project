package com.oops;

// parameter less
public class Employee {

	int id;
	String name;
	int age;
	String company;
	String city;

	public Employee() {
		id = 101;
		name = "Rushikesh";

	}

	// With Parameter

	public Employee(int eage, String ecompany, String ecity) {
		age = eage;
		company = ecompany;
		city = ecity;

	}

	public void display() {
		System.out.println(id + " " + name);

	}

	public void display1() {

		System.out.println(age + " " + company + " " + city);
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.display();
		Employee e1 = new Employee(28, "wipro", "pune");
		e1.display1();
	}

}
