package com.String;

import java.util.Scanner;

public class Even_Digit_Sum {

	public static void evenDigitSum(String st) {
		int sum = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) > '0' && st.charAt(i) < '9') {
				int num = Character.getNumericValue(st.charAt(i));
				if (num % 2 == 0) {
					sum = sum + num;
				}
			}
		}
		System.out.println("Sum of even digits are " + sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter string");
		String st = sc.next();

		evenDigitSum(st);
	}

}
