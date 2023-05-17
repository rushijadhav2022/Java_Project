package com.polymorphism;

class Girl {
	String name;

	public void show() {
		System.out.println("Someones Girl");
	}

}

class Mother extends Girl {
	int salary;

	public void setName() {
		name = "Pooja";
	}

	public void showName() {
		System.out.println(name);
	}

}

class Teacher extends Mother {
	public void assignSalary() {
		salary = 90000;
	}

	public void showSalary() {
		System.out.println(salary);
	}

}

public class MultilevelDemo1 {

	public static void main(String[] args) {

		Teacher t =new Teacher();
		t.show();
		t.setName();
		t.showName();
		t.assignSalary();
		t.showSalary();
		
	}

}
