package com.custom_hashmap;

import java.util.*;

public class ListOfEmployees {

	public static void main(String[] args) {

		Department d1 = new Department(1, "IT");
		Department d2 = new Department(2, "HR");
		Department d3 = new Department(3, "Finance");
		Department d4 = new Department(4, "Execution");

		Employee1 e1 = new Employee1(1, "Pooja", d1);
		Employee1 e2 = new Employee1(2, "Sonali", d2);
		Employee1 e3 = new Employee1(3, "Kinjal", d1);
		Employee1 e4 = new Employee1(4, "rahul", d1);
		Employee1 e5 = new Employee1(5, "rohit", d3);
		Employee1 e6 = new Employee1(6, "priya", d3);
		Employee1 e7 = new Employee1(7, "komal", d4);
		Employee1 e8 = new Employee1(8, "raj", d4);

		ArrayList<Employee1> ar = new ArrayList<>();
		HashMap<String, ArrayList<String>> hs = new HashMap<String, ArrayList<String>>();

		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		ar.add(e4);
		ar.add(e5);
		ar.add(e6);
		ar.add(e7);
		ar.add(e8);

		System.out.println(ar);

		Iterator<Employee1> itr = ar.iterator();
		while (itr.hasNext()) {
			Employee1 emp = itr.next();
			String d_name = emp.d.d_name;
			String e_name = emp.e_name;

			if (hs.containsKey(d_name)) {
				ArrayList<String> al2 = hs.get(d_name);
				al2.add(e_name);
				hs.put(d_name, al2);
			} else {
				ArrayList<String> al2 = new ArrayList<>();
				al2.add(e_name);
				hs.put(d_name, al2);

			}

		}
		System.out.println(hs);
	}

}
