package com.hashmap;

import java.util.*;

class Student {
	int id;
	String name;
	int percentage;

	public Student(int id, String name, int percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

}

public class HashMap4 {

	public static void main(String[] args) {

		ArrayList<Student> ar = new ArrayList<>();

		ar.add(new Student(1, "Rushi", 65));
		ar.add(new Student(2, "Ravi", 70));
		ar.add(new Student(3, "Ranvijay", 34));

		System.out.println(ar);

		HashMap<String, String> hs = new HashMap<>();

		Iterator<Student> s = ar.iterator();
		while (s.hasNext()) {
			Student s1 = s.next();
			if (s1.percentage < 80 && s1.percentage > 35) {
				String p = "pass";
				hs.put(s1.name, p);
			} else {
				String f = "fail";
				hs.put(s1.name, f);
			}
		}

		System.out.println(hs);
	}

}
