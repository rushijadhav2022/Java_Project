package com.lab_assignment;

import java.util.*;

public class Car {

	public static void main(String[] args) {

		int count = 0;
		int digit = 0;
		int sum = 0;

		int copy;
		int num;
		char ch;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 4 Digit number");
			num = sc.nextInt();
			copy = num;
			while (num > 0) {
				digit = num % 10;
				count++;
				num = num / 10;
			}
			if (count == 4) {
				System.out.println("valid");
			} else if (count != 4) {
				System.out.println(copy + " is not a valid number");
				break;
			}
			while (copy > 0) {
				digit = copy % 10;
				sum = sum + digit;
				copy = copy / 10;

			}

			if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {

				System.out.println("Lucky Number");

			} else {
				System.out.println("Sorry its not my lucky number");
			}

			System.out.println("Do you want to try another lucky name?");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
