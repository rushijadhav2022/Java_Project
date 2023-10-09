package com.String;

import java.util.Arrays;

public class String_logical {

	public static void main(String[] args) {

		String str = "I like to learn java";
		String st[] = str.split(" ");
		System.out.println(st.length);
		String rev = " ";
		String space = " ";
		for (int i = 0; i < st.length; i++) {
			for (int j = st[i].length() - 1; j >= 0; j--) {
				rev = rev + st[i].charAt(j);

			}
			rev = rev + space;

		}
		System.out.print(rev);
	}

}
