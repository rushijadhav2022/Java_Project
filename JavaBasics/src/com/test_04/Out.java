package com.test_04;

public class Out {

	int i=10;
	void m1(Out o)
	{
		this.i=o.i+i;
		System.out.println("i="+i);
		
	}
	
	void m2()
	{
		m1(this);
	}
	
	public static void main(String[] args) {
		
		Out oo =new Out();
		oo.i=15;
		oo.m2();
	}
	
	
}
