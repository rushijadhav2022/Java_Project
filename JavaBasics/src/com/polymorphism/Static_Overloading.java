package com.polymorphism;

public class Static_Overloading {

	public static void calculate(int num1, int num2) {
		System.out.println(num1 + num2);

	}

	public static void calculate(float num1, int num2) {
		System.out.println((int) num1 * num2);

	}

	public static void calculate(int div, int n1, int n2) {
		System.out.println(div = n1 - n2);
	}

	public static void calculate() {
		System.out.println("Default");
	}

	public static void main(String[] args) {
		Static_Overloading.main(null);
		Static_Overloading.calculate(50, 50);
		Static_Overloading.calculate(20.0f, 10);
		Static_Overloading.calculate(0, 50, 30);
		Static_Overloading.calculate();
        System.out.println("Main method");
        Static_Overloading.main(555);
       
        
        
	
}
	
	
	
	public static void main(int r1)
	{
		
		System.out.println(r1);
		
	}
	
	

}
