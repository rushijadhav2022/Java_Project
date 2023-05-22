package com.array;

import java.util.*;

public class Array_Using_Users_Input {

	public static void main(String[] args) {

		int ar[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array element");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("By Enhanced for loop--------------------");

		for (int x : ar) {
			System.out.println(x);
		}

		System.out.println("By toString................................");
		System.out.println(Arrays.toString(ar));
	}

}
