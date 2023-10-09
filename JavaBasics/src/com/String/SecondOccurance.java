package com.String;

public class SecondOccurance {

	public static void main(String[] args) {

		String s = "java programmes";
		int count = 0;
		int i;
		for (i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == 'a') {
				count++;
			}
			if (count == 2) {

				break;
			}
		}

		System.out.println(i);

	}

}
