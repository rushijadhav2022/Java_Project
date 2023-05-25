package com.arrayBy_object;

import java.util.*;

class Student {
	int sid;
	String sname;
	int marks;

	public Student(int sid, String sname, int marks) {

		this.sid = sid;
		this.sname = sname;
		this.marks = marks;

	}

	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", marks=" + marks;
	}

}

public class Course {

	int cid;
	String cname;
	Student std;

	public Course(int cid, String cname, Student std) {
		this.cid = cid;
		this.cname = cname;
		this.std = std;
	}

	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", std=" + std;
	}

	public static void main(String[] args) {

		Course c[] = new Course[2];
		for (int i = 0; i < c.length; i++) {
			System.out.println("Please enter course id");
			Scanner sc = new Scanner(System.in);
			int cid = sc.nextInt();
			System.out.println("Please enter course name");
			String cname = sc.next();
			System.out.println("Please enter Student id");
			int sid = sc.nextInt();
			System.out.println("please enter stud name");
			String sname = sc.next();
			System.out.println("please enter marks");
			int marks = sc.nextInt();

			c[i] = new Course(cid, cname, new Student(sid, sname, marks));

		}

		System.out.println("---------------------------------------------------");

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

		System.out.println("---------------------------------------------------");

		for (int i = 0; i < c.length; i++) {
			if (c[i].std.marks > 70) {
				System.out.println(c[i]);
			}
		}

	}

}
