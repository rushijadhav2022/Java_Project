package com.oops;

public class Loan {
	
	
	
	
	public void m1(int principle)
	{
		
	int Final_Amount=(principle*6*1)/100;
		System.out.println(Final_Amount);
		
	}
	
	public void m1(int principle,int days)
	{
	    
		if(days<365)
		{
		int Final_Amount=(principle*6*days)/(365*100);
		System.out.println(Final_Amount);		
		}
		else
		{
			
			int Final_Amount=(principle*12*days)/(365*100);
			System.out.println(Final_Amount);
		}
		
		
	}

	public static void main(String[] args) {
		
		
		Loan l=new Loan();
		l.m1(100000);
		l.m1(100000,365);

	}

}
