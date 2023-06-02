package com.String;

import java.util.Scanner;

public class Count_Vowels_in_String {

	public static void NumOfvowels(String st) {
		int count = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
					|| st.charAt(i) == 'u') {
				count++;
			}

		}
		System.out.println("Numbers of vowel are " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter string");
		String st = sc.nextLine();

		Count_Vowels_in_String.NumOfvowels(st);

	}

}
