package com.test_04;

public class Series1 {

	public static void main(String[] args) {

		int num = 1;
		int input = 10; // 1,2,4,7,16
		for (int i = 1; i <= 100; i++) {
			num = (num + i)-1;
			if (input == i)
				System.out.println(num);

		}

	}

}
