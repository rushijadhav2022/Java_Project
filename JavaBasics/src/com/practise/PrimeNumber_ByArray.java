package com.practise;

public class PrimeNumber_ByArray {

	public static void Prime_Num(int a[]) {

		for (int i = 0; i < a.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 5, 8, 9, 7 };

		Prime_Num(a);

	}

}
