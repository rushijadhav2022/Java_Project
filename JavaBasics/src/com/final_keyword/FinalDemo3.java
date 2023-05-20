package com.final_keyword;

class Parent {
	public final void show() {
		System.out.println("Parent");
	}

}

class Childd extends Parent {
//	public void show()  // Cannot override final method
	{

	}

	public void display() {
		super.show();
	}

}

public class FinalDemo3 {

	public static void main(String[] args) {

		Childd c = new Childd();
		c.display();

	}

}
