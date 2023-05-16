package com.javafundamentals;

import java.util.Scanner;

public class One_to_five_Numbers_Using_SwitchCase {

	public static void main(String[] args) {

		System.out.println("Enter a Number between 1 to 5 ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Wrong Input");

		}

	}

}
