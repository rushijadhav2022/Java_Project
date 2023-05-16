package com.javafundamentals;

public class SwitchCase_By_UnaryOperator {

	public static void main(String[] args) {

		int i=2, j = 0;
		switch (i) {
		case 0:
			j += 4;
			break;
		case 2:
			j += 6;
			break;
		case 4:
			j += 1;
			break;
		default:
			j += 2;

		}
		System.out.println("j= " + j);
	}

}
