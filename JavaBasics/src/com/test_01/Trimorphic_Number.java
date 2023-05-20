package com.test_01;

import java.util.Scanner;

public class Trimorphic_Number {

	public static void main(String[] args) {

		int num = 5;
		int num1 = num * num * num;
		int digit = 0;
		while (num1 > 0) {
			digit = num1 % 10;
			System.out.println(digit);
			break;

		}

		if (digit == num) {
			System.out.println("Trimorphic");
		} else {
			System.out.println("Not Trimorphic");
		}
	}

}
