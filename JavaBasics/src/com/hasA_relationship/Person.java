package com.hasA_relationship;

class Address{
	
	int pincode;
	String city;
	
	
	public Address(int pincode,String city)
	{
		this.pincode=pincode;     // this is used to avoid shadowing.
		this.city=city;
		
	}
	
	 public String toString() {
	        return pincode + " " + city;
	    }
	
}



public class Person {
	
	int pid;
	String name;
	Address adr;
	
	
	public Person(int pid,String name,Address adr)
	{
		this.pid=pid;
		this.name=name;
		this.adr=adr;
	}
	
	 public String toString() {
	        return pid + " " + name + " " +adr;
	    }

	public static void main(String[] args) {
		
		Person p =new Person(101,"RJ",new Address(415311,"Vita"));
		System.out.println(p);

	}

}
