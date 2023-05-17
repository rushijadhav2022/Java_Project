package com.polymorphism;

class Person {
	String name;

	public void eat() {
		System.out.println("Person is eating");

	}
}

class Employee extends Person {
	int salary;

	public void details() {
		name = "yash";
	}

	public void showEmpDetails() {
		System.out.println(name);
	}
}

class Manager extends Employee {
	int insentive;

	public void assignSalary() {
		salary = 78000;
		insentive = 6000;
	}

	public void findTotalsalary() {
		salary = salary + insentive;

	}

	public void showDetails() {
		System.out.println(name + " " + salary);
	}

}

public class MultilevelDemo {

	public static void main(String[] args) {

		Manager m = new Manager();
		m.eat();
		m.details();
		m.showEmpDetails();
		m.assignSalary();
		m.findTotalsalary();
		m.showDetails();

	}

}
