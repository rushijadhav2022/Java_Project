package com.lab_assignment;

public class Concrete_emp {

	public static void main(String[] args) {

		Employee2 emp = new Employee2();
		emp.setEmpid(124);
		emp.setName("Rushi");
		emp.setSalary(50000);
		System.out.println("Employee_Id : " + emp.getEmpid() + " Employee_Name : " + emp.getName()
				+ " Employee_Salary : " + 50000);

	}

}
