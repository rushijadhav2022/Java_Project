package com.custom_hashmap;

import java.util.*;
import java.util.Map.Entry;

public class EmployeeHashmap {

	public static void main(String[] args) {

		HashMap<Integer, Employee> emap = new HashMap();

		emap.put(1, new Employee(101, "Suraj", 89000));
		emap.put(1, new Employee(102, "Akshat", 99000));
		emap.put(1, new Employee(103, "Amey", 189000));
		emap.put(1, new Employee(104, "Prasad", 85000));
		emap.put(1, new Employee(105, "Mayur", 100000));

		for (Map.Entry<Integer, Employee> en : emap.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}

	}

}
