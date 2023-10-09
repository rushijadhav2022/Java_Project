package com.collections_comparable_comparator;

import java.util.*;

public class Student implements Comparable<Student> {

	int s_id;
	String s_name;
	int marks;

	public Student(int s_id, String s_name, int marks) {
		this.s_id = s_id;
		this.marks = marks;
		this.s_name = s_name;
	}

	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student s) {
//		if (s.s_id > this.s_id) {
//			return -1;
//		} else if (s.s_id < this.s_id) {
//			return 1;
//		} else {
//			return 0;
//		}

		// return this.s_id-s.s_id;
		// return s.s_id-this.s_id;
		return this.s_name.compareTo(s.s_name);
	}

	public static void main(String[] args) {

		ArrayList<Student> st = new ArrayList<>();
		st.add(new Student(42, "Rushikesh", 89));
		st.add(new Student(35, "Swapnil", 91));
		st.add(new Student(52, "Sushant", 93));

		for (Student s : st) {
			System.out.println(s);
		}

		System.out.println("================================================================================");

		Collections.sort(st);

		for (Student s : st) {
			System.out.println(s);
		}

	}

}
