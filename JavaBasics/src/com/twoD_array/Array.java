package com.twoD_array;

public class Array {

	public static void main(String[] args) {

		int ar[][] = { { 2, 5, 7 }, { 3, 9, 7 } };

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

	}

}
