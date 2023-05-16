package com.polymorphism;

class Animal {

	public void eat() {
		System.out.println("Eating...");
	}

}

class Dog extends Animal {

	public void bark() {
		System.out.println("Barking...");
	}

}

public class SingleDemo2 {

	public static void main(String[] args) {

		Dog an = new Dog();
		an.eat();
		an.bark();

	}

}
