package com.String;

public class Example {

	public static void main(String[] args) {

		String a = "Rushikesh Jadhav";

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ch = (char) (ch + 3);

			}
			System.out.print(ch);

		}

	}

}
