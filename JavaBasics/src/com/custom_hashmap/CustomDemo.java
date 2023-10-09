package com.custom_hashmap;

import java.util.*;

class Student {

	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return " id " + id + " " + name + " " + marks;
	}

	public int hashCode() {
		return id;

	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.id == s.id) {
			return true;
		} else {
			return false;
		}
	}

}

public class CustomDemo {

	public static void main(String[] args) {

		HashMap<Student, Integer> hm = new HashMap<>();
		hm.put(new Student(1, "Rushi", 78), 90);
		hm.put(new Student(2, "Ravi", 89), 92);
		hm.put(new Student(1, "Rahul", 89), 92);

		for (Map.Entry<Student, Integer> map : hm.entrySet()) {
			System.out.println(map);
		}

	}

}
