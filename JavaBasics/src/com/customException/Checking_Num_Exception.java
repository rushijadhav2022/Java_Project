package com.customException;

class BinaryNumberException extends Exception {

	BinaryNumberException(String s) {
		super(s);

	}

}

public class Checking_Num_Exception {

	public void check(int num) throws BinaryNumberException {
		int flag = 0;

		while (num > 0) {
			int rem = num % 10;
			// int res=rem%2;

			if (rem == 0 || rem == 1) {
				flag = 1;
			}

			else {
				throw new BinaryNumberException("Pls provid valid binary this is not an binary number");
			}
			num = num / 10;
		}

		if (flag == 1) {
			System.out.println("binary number executed");
		}

	}

	public static void main(String[] args) {

		Checking_Num_Exception c = new Checking_Num_Exception();

		try {
			c.check(111);
		} catch (BinaryNumberException e) {

			e.printStackTrace();
		}

	}

}
