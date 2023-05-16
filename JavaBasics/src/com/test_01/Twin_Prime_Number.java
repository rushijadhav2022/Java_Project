package com.test_01;

import java.util.Scanner;

public class Twin_Prime_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count1 = 0;
		int i = 2;
		int i1=2;
		char ch;
		do {
			System.out.println("Enter Number 1");

			int num1 = sc.nextInt();

			while (num1 > i) {
				if (num1 % i == 0) {
					count++;
					break;
				}
				i++;
			}

			if (count == 0) {
				System.out.println("prime");
			} else {

				System.out.println("Not prime");
				break;
			}

			System.out.println("Enter 2nd Number");
			int num2 = sc.nextInt();
			while (num2 > i1) {
				if (num2 % i1 == 0) {
					count1++;
					break;
				}
				i1++;
			}

			if (count1 == 0) {
				System.out.println("prime");
			} else {

				System.out.println("Not prime");
			}

			if (num1 - num2 == 2) {
				System.out.println("Twin Prime");
			} else {
				System.out.println("Not twin prime");
			}
			System.out.println("Do you Want to Continue........");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}
}
