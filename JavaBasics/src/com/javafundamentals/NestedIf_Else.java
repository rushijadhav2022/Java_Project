package com.javafundamentals;

public class NestedIf_Else {

	public static void main(String[] args) {
		
		
		int age=21;
		int weight =43;

		if(age>=18) {
		System.out.println("Eligible age for donate blood");
		
		if(weight>=45)
		{
			System.out.println("Sufficient Weight");
			
		}
		else
		{
			System.out.println("Unsufficient weight");
		}
		
		}
		else
		{
			System.out.println("Not eligible to donate blood");
		}
	}

}
