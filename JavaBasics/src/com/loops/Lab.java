package com.loops;

import java.util.Scanner;

public class Lab {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pizza = 1;
		int puff = 1;
		int cd = 1;
		char ch;
		do {
			System.out.println("How Many Pizza do you want? ");
			pizza = sc.nextInt();
			System.out.println("How Many Puffs do you want? ");
			puff = sc.nextInt();
			System.out.println("How Many CoolDrinks do you want? ");
			cd = sc.nextInt();
			int Total_Price = 100 * pizza + 20 * puff + 10 * cd;
			System.out.println(Total_Price);

			System.out.println("Do you want more");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
		System.out.println("Enjoy the show");
		

	}
}
