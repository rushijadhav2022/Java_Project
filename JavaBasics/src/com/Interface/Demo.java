package com.Interface;

interface Area {
	float pi = 3.14f; // ByDefault static and final i.e, static final float pi=3.14f;

	float calculate(float x, float y); // ByDefault public abstract i.e abstract public float calculate(float x,float
										// y);

}

class Rectangle implements Area {

	public float calculate(float x, float y) {

		return x * y;

	}

}

class Circle implements Area {

	public float calculate(float x, float y) {

		return pi * x * x;

	}

}

public class Demo {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		
		
		System.out.println("Area of rectangle = "+rect.calculate(20.0f, 10.0f));
		System.out.println("Area of Circle = "+cir.calculate(10.0f, 0.0f));

	}

}
