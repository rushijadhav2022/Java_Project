package com.loops;

public class KrishnamurtyNumber {

	public static void main(String[] args) {

		int num = 145;
		int fact = 1;
		int sum = 0;
		int copy = num;
		while (num > 0) {
			fact = 1;
			int digit = num % 10;
			for (int i = 1; i <= digit; i++) {

				fact = fact * i;

			}
			sum = sum + fact;
			num = num / 10;

		}

		if (copy == sum) {
			System.out.println("Krishnamurty number");
		} else {
			System.out.println("Not a Krishnamurty number");
		}

	}

}
