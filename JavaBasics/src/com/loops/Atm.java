package com.loops;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {

		Atm a = new Atm();

		int num1 = 1234;
		int balance = 1000;
		char ch;
		char c;

		do {

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter your pin");
			int pin = sc1.nextInt();
			if (pin == num1) {
				System.out.println("Great pin is correct..pls continue");
				do {
					System.out.println("Enter Your Choice \n1.Deposit\n2.Withdrawal\n3.Check_Balance");
					Scanner sc = new Scanner(System.in);
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Please enter amount to Deposit");
						int dAmount = sc.nextInt();
						balance = balance + dAmount;
						System.out.println("Your current balance is " + balance);
						break;

					case 2:
						int withdrawal;
						System.out.println("Please enter amount to Withdraw");
						withdrawal = sc.nextInt();
						if (withdrawal < balance) {
							balance = balance - withdrawal;
							System.out.println("Your current balance is " + balance);
						} else {
							System.err.println("Insufficient balance");
						}
						break;

					case 3:
						System.out.println("Your balance is " + balance);
						break;

					default:

					}

					System.out.println("Do you Want to do furthur transactions ");
					ch = sc.next().charAt(0);

				} while (ch == 'y' || ch == 'Y');

			} else {
				System.out.println("Incorrect pin..");
				System.out.println("pls enter correct pin");

			}

			System.out.println("Press yes for Re-enter pin");
			c = sc1.next().charAt(0);

		} while (c == 'y' || c == 'Y');

//		do {
//			System.out.println("Enter Your Choice \n1.Deposit\n2.Withdrawal\n3.Check_Balance");
//			Scanner sc = new Scanner(System.in);
//			int choice = sc.nextInt();
//			switch (choice) {
//			case 1:
//				System.out.println("Please enter amount to Deposit");
//				int dAmount = sc.nextInt();
//				balance = balance + dAmount;
//				System.out.println("Your current balance is " + balance);
//				break;
//
//			case 2:
//				int withdrawal;
//				System.out.println("Please enter amount to Withdraw");
//				withdrawal = sc.nextInt();
//				if (withdrawal < balance) {
//					balance = balance - withdrawal;
//					System.out.println("Your current balance is " + balance);
//				} else {
//					System.err.println("Insufficient balance");
//				}
//				break;
//
//			case 3:
//				System.out.println("Your balance is " + balance);
//				break;
//
//			default:
//
//			}
//
//			System.out.println("Do you Want to do furthur transactions ");
//			ch = sc.next().charAt(0);
//
//		} while (ch == 'y' || ch == 'Y');

	}

}
