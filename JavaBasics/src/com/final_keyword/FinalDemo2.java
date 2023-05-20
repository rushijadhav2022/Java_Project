package com.final_keyword;

public class FinalDemo2 {

	static final int x;

	static {
		x = 124;
	}

	public void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {

		FinalDemo2 d = new FinalDemo2();
		d.show();

	}

}
