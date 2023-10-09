package com.customArraylist;

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

	public String toString() {
		return "id " + id + " name " + name + " marks " + marks;
	}

}

public class CustomList1 {

	public static void main(String[] args) {

		ArrayList<Student> ar = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Pls enter the id");
			int id = sc.nextInt();
			System.out.println("Pls enter the name ");
			String name = sc.next();
			System.out.println("Pls enter the marks");
			int marks = sc.nextInt();
			ar.add(new Student(id, name, marks));

		}

		System.out.println("===============================================================");

		for (Student s : ar) {
			System.out.println(s);
		}

		System.out.println("===============================================================");

		Iterator<Student> itr = ar.iterator();
		while (itr.hasNext()) {
			Student ss = (Student) itr.next();
			if (ss.marks > 60) {
				System.out.println(ss);
			}
		}
	}

}
