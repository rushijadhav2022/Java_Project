package com.lab_assignment;

public class Employee {

	int employee_id;
	String name;
	int salary;

	public Employee(int employee_id, String name, int salary) {
		this.employee_id = employee_id;
		this.name = name;
		this.salary = salary;

	}

	public void display() {
		System.out.println("Employee_Id :" + employee_id);
		System.out.println("Employee_Name :" + name);
		System.out.println("Employee_Salary :" + salary);

	}

	public static int totalEmp(int total_emp) {
		return total_emp;

	}

	public static void main(String[] args) {

		System.out.println("Total no. of Employee " + totalEmp(4));
        Employee emp=new Employee(101,"RJ",50000);
        emp.display();
	}

}
