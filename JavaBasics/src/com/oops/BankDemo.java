package com.oops;

public class BankDemo {

	public static void main(String[] args) {

		Bank b1 = new Bank();
		System.out.println(b1.bankName("BOI"));
		// System.out.println(b1.lockerId()); // error---private method
		System.out.println(b1.rateofInterest(8.0f));
		System.out.println(b1.branchName("BOI-Vita"));
	}

}
