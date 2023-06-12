package com.arrayBy_object;

import java.util.Scanner;

class Courses {

	private int cid;
	private String cname;

	public void setCourseID(int cid) {
		this.cid = cid;
	}

	public void setCourseName(String cname) {
		this.cname = cname;
	}

	public int getCourseID() {
		return cid;
	}

	public String getCourseName() {
		return cname;
	}

	public String toString() {
		return " COURSE ID " + cid + " COURSE NAME " + cname;
	}

}

class Students {

	private int id;
	private String name;
	private int marks;
	Courses[] c; // created array of course according to student

	public void setID(int id) {
		this.id = id;

	}

	public void setName(String name) {
		this.name = name;

	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setCourse(Courses c[]) {
		this.c = c;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;

	}

	public Courses[] getCourse() {
		return c;
	}

	public String toString() {
		return " ID " + id + " NAME " + name + " MARKS " + marks + c;
	}

}

public class ArrayObject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Students s[] = new Students[3];
		System.out.println("Pls enter student details");
		for (int i = 0; i < s.length; i++) {
			System.out.println("Pls Enter the id of student");
			int id = sc.nextInt();
			System.out.println("Pls Enter the name of student");
			String name = sc.next();
			System.out.println("Pls enter the marks of student");
			int marks = sc.nextInt();
			System.out.println("Pls enter the total courses student took");
			int size = sc.nextInt();
			Courses c[] = new Courses[size];
			for (int j = 0; j < size; j++) {
				System.out.println("Pls enter course id");
				int cid = sc.nextInt();
				System.out.println("pls enter course name");
				String cname = sc.next();
				c[j] = new Courses();
				c[j].setCourseID(cid);
				c[j].setCourseName(cname);

			}

			s[i] = new Students();
			s[i].setID(id);
			s[i].setName(name);
			s[i].setMarks(marks);
			s[i].setCourse(c);

		}

		for (int i = 0; i < s.length; i++) {
			System.out.println(
					"STD ID " + s[i].getID() + " STD NAME " + s[i].getName() + " STD MARKS " + s[i].getMarks() + " ");
			Courses c[] = s[i].getCourse();
			for (Courses ct : c) {
				System.out.println("COURSE ID " + ct.getCourseID() + " COURSE NAME " + ct.getCourseName());

			}

		}

	}

}
