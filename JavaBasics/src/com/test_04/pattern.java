package com.test_04;

public class pattern {

	public static void main(String[] args) {
		int space = 4;
		for (int i = 1; i <= 5; i++) {

			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			space--;
			for (int j = 1; j <= i; j++) {

				{
					System.out.print("1");
				}

			}
			System.out.println();
		}

	}
}
