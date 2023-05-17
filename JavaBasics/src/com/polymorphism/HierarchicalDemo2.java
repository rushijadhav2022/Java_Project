package com.polymorphism;

class CatFamily {
	String name;

}

class Tiger extends CatFamily {

	public void showPos() {
		name = "Tiger";
		System.out.println(name + " is a largest cat in Catfamily");
	}

}

class Cat extends CatFamily {
	public void showPos() {
		name = "Cat";
		System.out.println(name + " is a smallest cat in Catfamily");
	}

}

public class HierarchicalDemo2 {

	public static void main(String[] args) {

		Tiger t = new Tiger();
		t.showPos();
		Cat c = new Cat();
		c.showPos();

	}

}
