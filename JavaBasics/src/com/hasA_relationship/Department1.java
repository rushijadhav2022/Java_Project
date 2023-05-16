package com.hasA_relationship;

class Employee1 {

	int eid;
	String ename;

	public Employee1(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;

	}

	public String toString() {
		return eid + " " + ename;
	}

}

public class Department1 {

	int did;
	String dname;
	Employee1 emp;

	public Department1(int did, String dname, Employee1 emp) {
		this.did = did;
		this.dname = dname;
		this.emp = emp;

	}

	public String toString() {
		return did + " " + dname + " " + emp;
	}

	public static void main(String[] args) {

		Department1 dp = new Department1(101, "DP2", new Employee1(124, "RJ"));
		System.out.println(dp);

	}

}
