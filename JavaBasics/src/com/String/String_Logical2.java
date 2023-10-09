package com.String;

public class String_Logical2 {

	public static void main(String[] args) {

		String str = "I like to learn java";
		String[] st = str.split(" ");
		String rev = "";
		String space = " ";

		for (int i = 0; i < st.length; i++) {
			if (st[i] == st[1] || st[i] == st[3] || st[i] == st[3]) {
				for (int j = st[i].length() - 1; j >= 0; j--) {
					rev = rev + st[i].charAt(j);
				}

			} else {
				for (int k = 0; k < st[i].length(); k++) {
					rev = rev + st[i].charAt(k);
				}
			}
			rev = rev + space;
		}
		System.out.println(rev);
	}

}
