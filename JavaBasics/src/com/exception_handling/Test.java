package com.exception_handling;

public class Test {

	public static void main(String[] args) {

		System.out.println("HII");
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Welcome Java");

	}

}
