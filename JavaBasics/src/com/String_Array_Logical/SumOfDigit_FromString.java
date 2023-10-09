package com.String_Array_Logical;

public class SumOfDigit_FromString {

	public static void main(String[] args) {
		
		String s="Surya234";
		
		
		char[] ch = s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				int digit = Character.getNumericValue(ch[i]);
				 sum=sum+digit;
			}
		}
		System.out.println(" Sum = "+sum);

	}

}
