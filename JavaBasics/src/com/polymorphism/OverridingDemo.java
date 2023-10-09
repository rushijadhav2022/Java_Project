package com.polymorphism;

class Balls {
	
	
	void showProperty(String msg) {
		System.out.println(msg);
		System.out.println("Its tennis ball");
	}

}

class Football extends Balls {
	@Override
	public void showProperty(String msg) {
		//super.showProperty();
		System.out.println(msg);
		System.out.println("Its Football");

	}

}

public class OverridingDemo {

	public static void main(String[] args) {

		Football f = new Football();
		f.showProperty("Hi hello");
		Balls b=new Balls();
		b.showProperty("hii");

	}

}
