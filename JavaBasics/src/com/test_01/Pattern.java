package com.test_01;

public class Pattern {

	public static void main(String[] args) {
		
		int space1=3;
		int space2=3;
		int count=1;
		for(int i=1;i<=4;i++)
		{
			for(int r1=1;r1<=space1;r1++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=count;j++)
			{
			System.out.print(i);
				
			}
			for(int r2=1;r2<=space2;r2++)
			{
				System.out.print(" ");
			}
			System.out.println();
			space1--;
			space2--;
			count=count+2;
		}
	}

}
