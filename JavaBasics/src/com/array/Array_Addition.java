package com.array;

import java.util.Arrays;

public class Array_Addition {

	public static void main(String[] args) {

		int a[] = { 7, 5, 6, 3, 2 };
		int b[] = { 3, 5, 4, 9, 8 };

		int c[] = new int[a.length];

		if (a.length == b.length) {

			for (int i = 0, j = 0, k = 0; i < a.length; i++, j++, k++) {

				c[k] = a[i] + b[j];

			}
			System.out.println(Arrays.toString(c));

		}

	}

}
