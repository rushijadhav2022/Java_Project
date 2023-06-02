package com.polymorphism;

class Balls {
	void showProperty() {
		System.out.println("Its tennis ball");
	}

}

class Football extends Balls {
	@Override
	public void showProperty() {
		//super.showProperty();
		System.out.println("Its Football");

	}

}

public class OverridingDemo {

	public static void main(String[] args) {

		Football f = new Football();
		f.showProperty();

	}

}
