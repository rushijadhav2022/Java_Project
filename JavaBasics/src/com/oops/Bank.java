package com.oops;

public class Bank {

	public String b_name;
	private int locker_id;
	protected float rateofinterest;
	String branch_name;

	public String bankName(String b_name) {
		return b_name;
	}

	private int lockerId(int locker_id) {
		return locker_id;
	}

	protected float rateofInterest(float rateofinterest) {
		return rateofinterest;
	}

	String branchName(String branch_name) {
		return branch_name;
	}

	public static void main(String[] args) {

		Bank b = new Bank();

		System.out.println(b.bankName("BOI"));
		System.out.println(b.lockerId(222));
		System.out.println(b.rateofInterest(8.0f));
		System.out.println(b.branchName("BOI-Vita"));
	}

}
