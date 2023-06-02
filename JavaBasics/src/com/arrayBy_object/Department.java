package com.arrayBy_object;

import java.util.Arrays;
import java.util.Scanner;

class Employee2 {
	int eid;
	String ename;
	int salary;

	public Employee2(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;

	}

	public String toString() {

		return " eid " + eid + " ename " + ename + " salary " + salary;

	}

}

public class Department {

	int did;
	String dname;
	Employee2[] e;

	public Department(int did, String dname, Employee2[] e) {
		this.did = did;
		this.dname = dname;
		this.e = e;

	}

	public String toString() {
		return " did " + did + " dname " + dname + " e " +Arrays.toString(e);
	}

	public static void main(String[] args) {

		Department dt[] = new Department[3];
		for (int i = 0; i < dt.length; i++) {
			System.out.println("Please enter department id");
			Scanner sc = new Scanner(System.in);
			int did = sc.nextInt();
			System.out.println("Please enter departname");
			String dname = sc.next();
			System.out.println("Please enter number of employees");
			int n = sc.nextInt();
			System.out.println("Please enter employee details");
			Employee2 e[] = new Employee2[2];
			for (int j = 0; j < e.length; j++) {
				System.out.println("Pls enter employee id");
				int eid = sc.nextInt();
				System.out.println("Pls enter employee name");
				String ename = sc.next();
				System.out.println("pls enter salary");
				int salary = sc.nextInt();
				e[j] = new Employee2(eid, ename, salary);
			}

			dt[i] = new Department(did, dname, e);

		}

		System.out.println("===============================================================");

		for (Department d : dt) {
			System.out.println(d);
		}
	}
}
