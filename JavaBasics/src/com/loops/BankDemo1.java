package com.loops;

import com.oops.*;

public class BankDemo1 extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b2 = new Bank();
		System.out.println(b2.bankName("BOI"));
	//	System.out.println(b2.lockerId(222)); // private error
	//	System.out.println(b2.rateofInterest(8.0f)); // protected error
	//	System.out.println(b2.branchName("BOI-Vita"));  //default error

		BankDemo1 b = new BankDemo1();
		System.out.println(b.rateofInterest(8.0f));  // protected 

	}

}
