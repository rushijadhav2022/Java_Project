package com.loops;

public class problem {

	public static void main(String[] args) {
		// 2,3,5,9,17,33,65,129
		int num = 2;
		System.out.print(num+" ");
		for (int i = 1; i <= 10; i++) {
       
			num = 2 * num - 1;
			
			System.out.print(num+" ");

		}

	}

}
