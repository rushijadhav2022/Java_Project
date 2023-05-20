package com.polymorphism;

class Animals {

	public void show() {
		System.out.println("Animal is running");
	}

}

class Dogs extends Animals {

	public void show() {
		System.out.println("Dog is running");

	}
}

class Cats extends Animals {

	public void show() {
		System.out.println("Cat is running");
	}

}

public class DynamicDemo {

	public static void main(String[] args) {

		Animals a = new Dogs(); // Dynamic method dispatch
		a.show();

	}

}
