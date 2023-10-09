package com.String_Array_Logical;

public class Count_Digits_inString {

	public static void main(String[] args) {

		String s = "sura3456ffeefhj";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				count++;
			}

		}
		System.out.println("Count = " + count);

	}

}
