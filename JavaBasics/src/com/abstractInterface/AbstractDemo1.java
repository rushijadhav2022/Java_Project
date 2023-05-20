package com.abstractInterface;

abstract class A {
	int x;

	public A() {
		x = 10;
	}

	abstract void add();

}

abstract class B extends A {
	int y;

	public B() {
		y = 10;
	}

	abstract void show();

}

class C extends B {
	int z;

	void add() {
		z = x + y;
	}

	void show() {
		System.out.println("Addition = " + z);
	}

}

public class AbstractDemo1 {

	public static void main(String[] args) {

		C c = new C();
		c.add();
		c.show();

	}

}
