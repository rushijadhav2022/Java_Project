package com.test_04;

public class StrBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Poly");
		System.out.println(sb.append("Morph"));
		sb.reverse();
		// System.out.println(sb);
		sb.append("ism");
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		System.out.println(str.substring(5));
	}

}
