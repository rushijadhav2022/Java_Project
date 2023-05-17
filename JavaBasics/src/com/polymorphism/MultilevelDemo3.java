package com.polymorphism;

class Fruit {
	String name;

	public void show() {

		System.out.println("This is fruit");
	}

}

class Grapes extends Fruit {
	String product;

	public void assignName() {
		name = "Black_Grapes";
	}

	public void showName() {
		System.out.println(name);
	}

}

class Kismis extends Grapes {
	public void assignProd() {
		product = "Black-Cashew";

	}

	public void showProd() {
		System.out.println(product);
	}

}

public class MultilevelDemo3 {

	public static void main(String[] args) {

		Kismis k = new Kismis();
		k.show();
		k.assignName();
		k.showName();
		k.assignProd();
		k.showProd();

	}

}
