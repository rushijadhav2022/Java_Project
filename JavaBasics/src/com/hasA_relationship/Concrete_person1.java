package com.hasA_relationship;

public class Concrete_person1 {

	public static void main(String[] args) {

		Person1 p1 = new Person1();
		p1.setPid(124);
		p1.setName("Rushikesh");
		p1.setAddress(new Address1());
		Address1 a = p1.getAddress();
		a.setPincode(415311);
		a.setCity("Vita");
		System.out.println(p1.getPid());
		System.out.println(p1.getName());
		System.out.println(a.getPincode());
		System.out.println(a.getCity());

	}

}
