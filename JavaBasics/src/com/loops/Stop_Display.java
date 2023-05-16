package com.loops;
//stop displaying number when it reach to double digit
public class Stop_Display {

	public static void main(String[] args)
	{
		for(int i=1;i<=20;i++)
		{
			if(i==10)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
