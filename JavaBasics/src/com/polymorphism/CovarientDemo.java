package com.polymorphism;

class Vehicles {

	public Vehicles show() {
		
		System.out.println("Vehicle");
		return new Cars();

	}

}

class Cars extends Vehicles {
	public Vehicles show() {
          super.show();
		System.out.println("Cars");
		return new Cars();
		

	}

}

public class CovarientDemo {

	public static void main(String[] args) {

		Cars c = new Cars();
		c.show();

	}

}
