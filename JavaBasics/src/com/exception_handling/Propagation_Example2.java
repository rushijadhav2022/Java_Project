package com.exception_handling;

public class Propagation_Example2 {

	void m() {
		throw new NullPointerException("Device error");
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {

		Propagation_Example2 n = new Propagation_Example2();
		n.p();
		System.out.println("Normal Flow");
	}

}
