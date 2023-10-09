package com.String;

import java.util.*;

public class Convert_Uppercase_to_Lowercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Pls Enter ther String");
		String str = sc.nextLine();
		String nw = "";
		String space = " ";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				nw = nw + space;
			} else {
				c = (char) (c + 32);
				nw = nw + c;
			}
		}

		System.out.println(nw);
	}
}
