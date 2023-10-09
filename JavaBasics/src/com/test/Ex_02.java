package com.test;

public class Ex_02 {

	public static void main(String[] args) {

		String s = "India is my country";
		String s1 = s.replace("I","@").replace("i","@");
		
		//System.out.println(s1);

		String[] sp = s1.split(" ");
		
		for (int i = 0; i < sp.length; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(sp[j]+" ");
			}
			System.out.println();
		}

	}

}
