package com.loops;

public class Check_Num_Automorphic {

	public static void main(String[] args) {
		// 25

		int num = 625;
		int power = 1;
		int count = 0;
		int copy=num;
		
		
		while(num>0)
		{ 
			
			
				int digit=num%100;
				int square=digit*digit;
				num=num/100;
		}
		
		if(copy==power)
		{
			System.out.println("Automorphic");
			
		}
		else {
			
			System.out.println("Not Automorphic");
		}
	}

}
