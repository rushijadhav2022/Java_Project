package com.String;

import java.util.*;

public class String_Pattern {

	public static void stringPattern(String st) {

		String[] s = st.split(" ");

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(s[j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter string");
		String st = sc.nextLine();

		stringPattern(st);

	}

}
