package com.exception_handling;

public class Propagation_exception {

	void m() {

		int data = 50 / 0;

	}

	void n() {

		m();

	}

	void p() {

		m();

	}

	public static void main(String[] args) {

		Propagation_exception p = new Propagation_exception();
		try {
			p.p();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}

		System.out.println("Normal Flow......");

	}

}
