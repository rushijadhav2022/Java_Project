package com.test_04;

public class Variables {

	// static int a = 10;
	// int b = 11;
	private int r = 3;

	public void show() {
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(r);
	}

	public static void show1() {
		Variables v = new Variables();
		// System.out.println(a);
		// System.out.println(v.b);
	}

	public void m1() {
		System.out.println("hii");
	}

	public int Add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Variables v = new Variables();
		// System.out.println(v.b);
		// System.out.println(v.r);
		// System.out.println(Variables.a);
		// v.show();
		// show1();
		v.Add(5, 5);
		v.Add(5, 5);
		System.out.println(v.Add(5, 6));
		v.m1();

	}

}
