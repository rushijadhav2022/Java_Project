package com.custom_hashmap;

import java.util.*;

class Customer {
	int c_code;
	String name;
	String address;
	float balance;

	public Customer(int c_code, String name, String address, float balance) {
		this.c_code = c_code;
		this.name = name;
		this.address = address;
		this.balance = balance;

	}

	public Customer(String name, String address, float balance) {
		super();
		this.name = name;
		this.address = address;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [ name=" + name + ", address=" + address + ", balance=" + balance + "]";
	}

}

public class Std_Demo {

	public static void main(String[] args) {

		ArrayList<Customer> ar = new ArrayList<>();
		ar.add(new Customer(1, "Rushi", "vita", 20000));
		ar.add(new Customer(2, "Vijay", "Satara", 45000));
		ar.add(new Customer(3, "Atul", "sangamner", 100000));

		HashMap<Integer, Customer> hs = new HashMap<>();
		Iterator<Customer> itr = ar.iterator();
		while (itr.hasNext()) {
			Customer c = (Customer) itr.next();
			int a = c.c_code;
			String name = c.name;
			String address = c.address;
			float balance = c.balance;
			hs.put(a, new Customer(name, address, balance));
		}

		for (Map.Entry<Integer, Customer> m : hs.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
