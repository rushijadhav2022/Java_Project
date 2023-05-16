package com.oops;

public class Emp {

	int id;
	String name;
	int salary;
	int age;

	public Emp(int eid, String ename, int esalary, int eage) {
		id = eid;
		name = ename;
		salary = esalary;
		age = eage;

	}

	public void display() {
		
		System.out.println("Employee Name = "+name);
		
		if (age > 60) {
			System.out.println("Salary with bonus = "+( salary + 5000));

		} else if (age > 40) {
			System.out.println("Salary with bonus = "+(salary + 2000));
		} else {
			System.out.println("Salary = "+salary);
		}
	}

	public static void main(String[] args) {

		Emp e = new Emp(101, "Rushikesh", 50000, 62);
		e.display();
		

	}

}
