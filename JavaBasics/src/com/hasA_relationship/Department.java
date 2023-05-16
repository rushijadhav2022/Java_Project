package com.hasA_relationship;

class Employee {

	private int eid;
	private String ename;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

}

public class Department {

	private int did;
	private String dname;
	private Employee emp;

	public void setDid(int did) {
		this.did = did;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setEmployee(Employee emp) {
		this.emp = emp;
	}

	public int getDid() {
		return did;
	}

	public String getDname() {
		return dname;
	}

	public Employee getEmployee() {
		return emp;
	}
}
