package com.array;

import java.util.*;

public class Logical_Array_Max_Char {

	public static void maxChar(char c[]) {
		char maxChar = c[0];
		for (int i = 0; i < c.length; i++) {
			if (maxChar < c[i]) {
				maxChar = c[i];
			}

		}
		System.out.println(maxChar);

	}

	public static void main(String[] args) {

		char ch[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter elements of an array");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);

		}

		Logical_Array_Max_Char.maxChar(ch);

	}

}
