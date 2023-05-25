package com.arrayBy_object;

import java.util.*;

class Employeee {
	int id;
	String name;
	int salary;

	public Employeee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}

}

public class Test1 {

	public static void main(String[] args) {

		Employeee em[] = new Employeee[3];
		for (int i = 0; i < em.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter id of employee");
			int id = sc.nextInt();
			System.out.println("Please enter the name of student");
			String name = sc.next();
			System.out.println("Please enter the salary of employee");
			int salary = sc.nextInt();
			em[i] = new Employeee(id, name, salary);

		}

		System.out.println("-------------------------------------------------");

		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i]);
		}

		System.out.println("-------------------------------------------------");

		for (Employeee r : em) {
			System.out.println(r);
		}

		System.out.println("---------------------------------------------------");

		for (int i = 0; i < em.length; i++) {
			if (em[i].salary > 60000) {
				System.out.println(em[i]);
			}
		}
	}

}
