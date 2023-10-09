package com.test;

public class Ex_05 {

	public static void main(String[] args) {

		String s = "I love uk country";

		String[] sp = s.split(" ");
		int i;
		for (i = 0; i < sp.length - 1; i++) {
			for (int j = i + 1; j < sp.length; j++) {
				if (sp[i].length() > sp[j].length()) {
					String temp = sp[i];
					sp[i] = sp[j];
					sp[j] = temp;
				}

			}

		}
		for (i = sp.length-1; i >= 0; i--) {
			System.out.print(sp[i] + " ");
		}
	}

}
