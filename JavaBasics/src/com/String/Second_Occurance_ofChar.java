package com.String;

import java.util.*;

public class Second_Occurance_ofChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter String");
		String str = sc.nextLine();
		System.out.println("Enter character");
		char c = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				count++;
			}

			if (count == 2) {
				System.out.println("Second occurance at index = " + i);
				break;
			}
		}

	}

}
