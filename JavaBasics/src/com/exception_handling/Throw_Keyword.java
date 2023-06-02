package com.exception_handling;

public class Throw_Keyword {
	public static void isInvalid(int age) {
		if (age < 18) {
			throw new ArithmeticException("Invalid age");
		} else {
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) {

		try {
			isInvalid(12);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Done");

	}

}
