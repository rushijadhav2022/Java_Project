package com.String;

public class FrequencyOfCharacters {

	public static void main(String[] args) {

		String str = "Rushikesh";

		for (int i = 0; i < str.length(); i++) {
			boolean isPresent = true;
			int count = 1;
			for (int k = i - 1; k >= 0; k--) {
				if (str.charAt(i) == str.charAt(k)) {
					isPresent = false;
					break;
				}
			}
			if (isPresent == true) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
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
