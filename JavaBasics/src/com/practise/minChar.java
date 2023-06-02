package com.practise;

import java.util.*;

public class minChar {

	public static void minChar(char a[]) {

		char minChar = a[0];
		for (int i = 0; i < a.length; i++) {
			if (minChar > a[i]) {
				minChar = a[i];
			}

		}
		System.out.println("Min " + minChar);
	}

	public static void main(String[] args) {

		char a[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter element in array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}

		minChar(a);

	}

}
