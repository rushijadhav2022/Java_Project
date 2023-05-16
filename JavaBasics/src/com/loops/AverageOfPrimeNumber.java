package com.loops;

public class AverageOfPrimeNumber {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isPrime = true;

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;

				}
			}

			if (isPrime == true) {
				count++;
				sum = sum + num;

			}

		}
		System.out.println(count);
		avg = sum / count;
		System.out.println(avg);
	}

}
