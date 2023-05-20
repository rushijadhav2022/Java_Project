package com.final_keyword;

public class FinalDemo1 {

	final int x;

	public FinalDemo1() {
		x = 89;
	}

	public void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {

		FinalDemo1 f1 = new FinalDemo1();
		System.out.println(f1.x);
		f1.show();
	}

}
