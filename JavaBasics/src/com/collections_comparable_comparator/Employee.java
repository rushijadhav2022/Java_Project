package com.collections_comparable_comparator;

import java.util.*;

class CompareID implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o2.e_id - o1.e_id;

	}

}

class CompareSalary {

}

public class Employee {

	int e_id;
	String e_name;
	float e_salary;

	public Employee(int id, String name, float salary) {
		e_id = id;
		e_name = name;
		e_salary = salary;
	}

	public String toString() {
		return "Employee [ e_id " + e_id + " e_name " + e_name + " e_salary " + e_salary + "]";
	}

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "Rushikesh", 56000));
		emp.add(new Employee(2, "Swapnil", 65000));
		emp.add(new Employee(3, "Sushant", 90000));

		for (Employee e : emp) {
			System.out.println(e);
		}

		System.out.println("============================================================");

		Collections.sort(emp, new CompareID());
		for (Employee e1 : emp) {
			System.out.println(e1);
		}

	}

}
