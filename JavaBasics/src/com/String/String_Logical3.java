package com.String;

import java.util.Arrays;

public class String_Logical3 {

	public static void main(String[] args) {

		String s = "I like to learn java";
		String[] words = s.split(" ");
		StringBuilder output = new StringBuilder();

		for (String word : words) {
			if (word.equals("like")) {
				output.append("learn");
			} else if (word.equals("learn")) {
				output.append("like");
			} else {
				output.append(word);
			}
			output.append(" ");
		}

		String result = output.toString().trim();
		System.out.println(result);
	}
}
