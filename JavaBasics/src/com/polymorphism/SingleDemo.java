package com.polymorphism;

class Laptop {
	String ramSize = "8GB";
}

class Dell extends Laptop {
	public void show() {
		System.out.println(ramSize);
	}

	public void dellDetails() {
		System.out.println("This is Dell with 24 inch screen");

	}

}

public class SingleDemo {

	public static void main(String[] args) {

		Dell d=new Dell();
		d.show();
		d.dellDetails();
		
	}

}
