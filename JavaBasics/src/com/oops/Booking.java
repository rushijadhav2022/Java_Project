package com.oops;

import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {

		Movie m = new Movie();
		// m.getPrice();
		int price = m.getPrice();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Person Name");
		String name = sc.next();
		System.out.println("Do you have Coupon");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			System.out.println("Enter coupon number");

			int coupon = sc.nextInt();
			if (coupon == 100) {

				Movie m1 = new Movie();
				int discount = (15 * price) / 100;
				int originalPrice = price - discount;
				System.out.println("Your Ticket Price = " + originalPrice + " Rupees");
			} else if (coupon == 200) {

				int discount = (10 * price) / 100;
				int originalPrice = price - discount;
				System.out.println("Your Ticket Price = " + originalPrice + " Rupees");
			}
		} else {
			System.out.println("Your Ticket Price = " + price + " Rupees");
		}

		System.out.println("Enjoy the Show....");

	}

}
