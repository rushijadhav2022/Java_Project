package com.array;

import java.util.*;

public class Array_Logical_Alternate_Char {

	public static void alternateChar(char c[]) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				c[i] = (char) (c[i] + 2);
			} else if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) (c[i] + 2);
			} else {
				c[i] = c[i];
			}
		}

		System.out.println(Arrays.toString(c));

	}

	public static void main(String[] args) {

		char ch[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter an elements");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);

		}

		Array_Logical_Alternate_Char.alternateChar(ch);
	}

}
