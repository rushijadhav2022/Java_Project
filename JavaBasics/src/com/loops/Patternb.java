package com.loops;

public class Patternb {

	public static void main(String[] args) {

		for (char i = 'D'; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
