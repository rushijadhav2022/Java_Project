package com.exception_handling;

public class MultiCatch {

	public static void main(String[] args) {

		try {

			int a[] = null;
			System.out.println(a[5] / 0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException a) {
			System.out.println(a);
		} catch (Exception c) {
			System.out.println(c);
			c.printStackTrace();
		}

		System.out.println("Welcome java");

	}

}
