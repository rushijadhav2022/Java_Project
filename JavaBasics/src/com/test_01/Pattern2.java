package com.test_01;

public class Pattern2 {

	public static void main(String[] args) {
		
		int space = 0;
		for (int k = 5; k>=1; k--) {
			for (int r = 1; r <= space; r++) {
				System.out.print(" ");

			}
			

			for (int l = 1; l<=k; l++) {
				System.out.print(l);
			}
			System.out.println();
			space++;
		}
		

	}

}
