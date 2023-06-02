package com.String;

import java.util.Scanner;

public class ToggleCase {

	public static void toggleCase(String st) {
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch > 'a' && ch < 'z') {
				System.out.print(ch = (char) (ch - 32));
			} else if (ch > 'A' && ch < 'Z') {
				System.out.print(ch = (char) (ch + 32));
			} else {
				System.out.print(ch = ch);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls enter string");
		String st = sc.nextLine();

		toggleCase(st);

	}

}
