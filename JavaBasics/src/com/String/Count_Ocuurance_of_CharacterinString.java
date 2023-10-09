package com.String;

public class Count_Ocuurance_of_CharacterinString {

	public static void main(String[] args) {
		String str = "rushikesh";

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			boolean isPresent = true;
			for (int j = i - 1; j >= 0; j--) {
				if (str.charAt(i) == str.charAt(j)) {
					isPresent = false;
					break;
				}
			}

			if (isPresent) {

				for (int k = i + 1; k < str.length(); k++) {
					if (str.charAt(i) == str.charAt(k)) {
						count++;
					}
				}
				if (count >= 1) {
					System.out.println(str.charAt(i) + " " + count);
				}
			}

		}

	}

}
