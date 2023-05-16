package com.loops;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit == 3) {
				count++;
			}
			num = num / 10;

		}

		if (count != 0) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}

	}

}
