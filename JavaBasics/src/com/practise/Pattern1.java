package com.practise;

public class Pattern1 {

	public static void main(String[] args) {
		int space = 4;
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			space--;
			for (int k = 1; k <= i; k++) {
				if (k % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
