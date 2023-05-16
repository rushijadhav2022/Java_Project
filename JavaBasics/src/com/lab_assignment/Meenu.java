package com.lab_assignment;
import java.util.Scanner;
public class Meenu {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int coins=0;
		if(num>0)
		{
		for(int i=1;i<=num;i++)
		{
			 coins=i*i*i;
			
		}
		System.out.println("Meenu gets "+coins+ " coins");
		}
		else
		{
			System.out.println("Invalid Age ");
		}
	}

}
