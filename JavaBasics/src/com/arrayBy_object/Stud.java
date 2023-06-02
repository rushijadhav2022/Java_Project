package com.arrayBy_object;

import java.util.Arrays;
import java.util.Scanner;

public class Stud {

	int id;
	String name;
	int marks[];

	public Stud(int id, String name, int marks[]) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public String toString() {
		return " id " + id + " name " + name + " marks " + Arrays.toString(marks);
	}

	public static void main(String[] args) {

		Stud std[] = new Stud[3];
		for (int i = 0; i < std.length; i++) {
			System.out.println("Please Enter student id");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();
			System.out.println("Please enter student name");
			String name = sc.next();
			int mk[] = new int[2];
			System.out.println("please enter marks");
			for (int j = 0; j < mk.length; j++) {
				mk[j] = sc.nextInt();
			}

			std[i] = new Stud(id, name, mk);

		}
		
		for(int i=0;i<std.length;i++)
		{
			System.out.println(std[i]);
		}
	}

}
