package com.customException;

import com.customException.Test.TooOldException;
import com.customException.Test.TooYoungException;

public class Test {

	class TooYoungException extends Exception {

		public TooYoungException(String msg) {

			super(msg);
		}

	}

	class TooOldException extends Exception {

		public TooOldException(String msg) {

			super(msg);

		}

	}

	public void checkAge(int age) throws TooYoungException, TooOldException {

		if (age < 18) {
			throw new TooYoungException("Pls wait some more time..your age is below valid age limit");
		}

		else if (age > 60) {
			throw new TooOldException("Too old your age allready crossed...");
		}

		else {
			System.out.println("Your age ok we will send u suitable match through email");
		}

	}

	public static void main(String[] args) {

		Test t = new Test();

		try {
			t.checkAge(16);
		} catch (TooYoungException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (TooOldException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} finally {
			System.out.println("Always Execute...");
		}

	}

}
