package com.hasA_relationship;

class Address1 {

	private int pincode;
	private String city;

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public String getCity() {
		return city;
	}

}

public class Person1 {

	private int pid;
	private String name;
	private Address1 adr;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address1 adr) {
		this.adr = adr;
	}

	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public Address1 getAddress() {
		return adr;
	}
}
