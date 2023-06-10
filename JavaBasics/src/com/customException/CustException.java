package com.customException;

class InvalidBinary extends RuntimeException {
	public InvalidBinary() {
		System.out.println("invalid binary number");
	}

	public InvalidBinary(String msg) {
		super(msg);
	}

}

public class CustException {

	public static void checkBinary(int num) {

		boolean isBinary = true;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			if (digit == 1 || digit == 0) {
				continue;
			} else {
				isBinary = false;
				break;
			}
		}

		if (isBinary == false) {
			System.out.println("Number is not binary");
		} else {

		}

	}

	public static void main(String[] args) {
		
		

	}

}
