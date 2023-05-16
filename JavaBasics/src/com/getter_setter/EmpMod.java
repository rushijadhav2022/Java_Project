package com.getter_setter;

public class EmpMod {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setId(124);
		emp.setName("RJ");
		emp.setSalary(30000);

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
