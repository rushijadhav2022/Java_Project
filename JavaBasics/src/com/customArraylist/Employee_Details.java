package com.customArraylist;

import java.util.*;

public class Employee_Details {
	int emp_id;
	String emp_name;
	int emp_salary;
	String emp_dept;

	public Employee_Details(int emp_id, String emp_name, int emp_salary, String emp_dept) {

		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_dept = emp_dept;

	}

	public static void showSalary(ArrayList<Employee_Details> emp, Iterator<Employee_Details> itr, int size) {

		while (itr.hasNext()) {
			Employee_Details e = (Employee_Details) itr.next();
			if (e.emp_salary > 60000) {
				System.out.println(e);
			}

		}

	}

	public static void showDept(ArrayList<Employee_Details> emp, int size, ListIterator<Employee_Details> ltr) {

		while (ltr.hasNext()) {
			Employee_Details e1 = ltr.next();
			if (e1.emp_dept.equalsIgnoreCase("Sales")) {
				System.out.println(e1);
			}
		}

	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_dept="
				+ emp_dept + "]";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls give size");
		ArrayList<Employee_Details> emp = new ArrayList<>();
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Pls enter employee id");
			int emp_id = sc.nextInt();
			System.out.println("Pls enter employee name");
			String emp_name = sc.next();
			System.out.println("Pls enter employee salary");
			int emp_salary = sc.nextInt();
			System.out.println("Pls enter emplyee department");
			String emp_dept = sc.next();

			emp.add(new Employee_Details(emp_id, emp_name, emp_salary, emp_dept));

		}

		Iterator<Employee_Details> itr = emp.iterator();
		ListIterator<Employee_Details> ltr = emp.listIterator();

		showSalary(emp, itr, size);

		showDept(emp, size, ltr);

	}

}
