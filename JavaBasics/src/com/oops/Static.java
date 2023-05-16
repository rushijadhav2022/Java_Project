package com.oops;

public class Static {

	static int r1 = 100;
           
	public static void m1() {
		System.out.println(r1);
	}

	public void m2() {
		System.out.println(r1);
	}
	
	static {
		
		System.out.println("block");
	}

	public static void main(String[] args) {

		m1();

		Static s = new Static();
		s.m2();

	}

}
