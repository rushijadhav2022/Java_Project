package com.loops;

public class Kaprekar_Number {

	public static void main(String[] args) {

		int num = 45;
		int num1 = num * num;
		int sum = 0;

		while (num1 > 0) {
			int digit = num1 % 100;
			sum = sum + digit;
			num1 = num1 / 100;
		}

		if (sum == num) {
			System.out.println("Kaprekar");

		} else {
			System.out.println("Not Kaprekar");
		}

	}

}
