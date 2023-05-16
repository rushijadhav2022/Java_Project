package com.loops;

public class PatternA {

	public static void main(String[] args) {

		for (char i ='A' ; i <= 'D'; i++) {

			for (char j = 'D'; j >=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
