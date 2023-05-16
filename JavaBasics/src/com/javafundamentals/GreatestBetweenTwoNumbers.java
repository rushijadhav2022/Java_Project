package com.javafundamentals;

import java.util.Scanner;

public class GreatestBetweenTwoNumbers {

	public static void main(String[] args) {
		int num = 1;
		System.out.println("Please Enter Number 1 ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.println("Please Enter Number 2 ");
		int number2 = sc.nextInt();
		switch (num) {

		case 1:
			if (number1 > number2) {
				System.out.println(number1 + " " + "is greater than" + " " + number2);
			} else {
				System.out.println(number2 + " " + "is greater than" + " " + number1);
			}
			break;

		default:
		}
	}

}
