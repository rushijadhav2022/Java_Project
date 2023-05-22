package com.test_04;

public class numpattern {

	public static void main(String[] args) {
		int space=0;
		for(int i=5;i>=1;i--)
		{
			for( int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space++;
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
