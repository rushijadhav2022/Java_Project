package com.array;

import java.util.Arrays;

public class Even_Odd_Alternate {

	public static void main(String[] args) {
		int ecount = 0;
		int ocount = 0;
		int x = 0;
		int y = 0;
		int arr[] = { 11, 2, 4, 6, 5, 7, 8, 66, 77, 80 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				ecount++;
			} else {
				ocount++;
			}
		}
		System.out.println(ocount + " " + ecount);
		int a1[] = new int[ecount];
		int a2[] = new int[ocount];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				a1[x] = arr[i];
				x++;
			} else {
				a2[y] = arr[i];
				y++;
			}
		}

		x = 0;
		y = 0;
		for (int i = 0; i < arr.length; i++)
			if (y < a2.length) {
				if (i % 2 == 0) {
					arr[i] = a1[x];
					x++;
				} else {
					arr[i] = a2[y];
					y++;
				}
			} else {
				arr[i] = a1[x];
				x++;
			}

		System.out.println(Arrays.toString(arr));

	}

}
