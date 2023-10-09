package com.String;

public class frequency_word {
	
	

	public static void main(String[] args) {

		String s = "i love my india and india is my country";
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			boolean isVisited = true;
			for (int k = i - 1; k >= 0; k--) {
				if (str[i].equals(str[k])) {
					isVisited = false;
					break;
				}
			}
			if (isVisited) {
				for (int j = i + 1; j < str.length; j++) {
					if (str[i].equals(str[j])) {
						count++;
					}
				}
				// System.out.println(str[i] + " " + count);
				if (count >= 1) {
					System.out.println(str[i] + " " + count);
				}
			}
			
		}

	}

}
