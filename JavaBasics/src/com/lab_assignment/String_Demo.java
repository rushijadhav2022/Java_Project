package com.lab_assignment;

public class String_Demo {

	public static void main(String[] args) {

		String s = "india is beutiful country";

		String[] st = s.split(" ");

		for (int i = 0; i < st.length; i++) {
			String word = st[i];
			char[] c = word.toCharArray();
			for (int j = 0; j < word.length(); j++) {
				if (j == 0) {

					c[j] = (char) (c[j] - 32);
					System.out.print(c[j]);
				} else {
					System.out.print(c[j]);
				}
			}
			System.out.print(" ");

		}

	}
}
