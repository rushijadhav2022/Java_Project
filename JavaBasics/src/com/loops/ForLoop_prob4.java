package com.loops;

public class ForLoop_prob4 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println("Total count of odd numbers between 1 to 50 is = " + count);
	}

}
