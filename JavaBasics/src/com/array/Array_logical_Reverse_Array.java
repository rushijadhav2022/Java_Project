package com.array;

import java.util.*;

public class Array_logical_Reverse_Array {

	public static void reverseArray(char ch[]) {
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i] + " ");
		}

	}

	public static void main(String[] args) {

		char c[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter elements of an array");
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(c));
		Array_logical_Reverse_Array.reverseArray(c);
	}

}
