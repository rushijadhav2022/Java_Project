package com.hasA_relationship;

public class Concrete_Department {

	public static void main(String[] args) {

		Department d = new Department();
		d.setDid(124);
		d.setDname("Technical");
		d.setEmployee(new Employee());
		Employee e = d.getEmployee();
		e.setEid(101);
		e.setEname("Rushi");
		System.out.println(d.getDid());
		System.out.println(d.getDname());
		System.out.println(e.getEid());
		System.out.println(e.getEname());

	}

}
