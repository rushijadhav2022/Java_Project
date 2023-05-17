package com.polymorphism;

class Vehicle {
	int wheels;

}

class Car extends Vehicle {
	public void showCar() {
		wheels = 4;
		System.out.println("Car Wheels = " + wheels);
	}

}

class Truck extends Vehicle {
	public void showTruck() {
		wheels = 8;
		System.out.println("Truck Wheels = " + wheels);

	}

}

public class HierarchicalDemo {

	public static void main(String[] args) {

		Car c = new Car();
		c.showCar();
		Truck t = new Truck();
		t.showTruck();

	}

}
