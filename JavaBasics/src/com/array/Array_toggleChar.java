package com.array;

import java.util.*;

public class Array_toggleChar {

	public static void toggleChar(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] <= 'A' && ch[i] >= 'Z') {

				ch[i] = (char) (ch[i] + 32);

			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else {
				ch[i] = ch[i];
			}
		}

		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {

		char c[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter an elements of an array");
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
        System.out.println(Arrays.toString(c));
		Array_toggleChar.toggleChar(c);

	}

}
