package com.String_Array_Logical;

public class Replace_First_Letter {

	public static void main(String[] args) {
	
		
		String str="i love programming";
		
		String[] s = str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			char[] c = s[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[j]==c[0])
				{
					c[j]=(char)(c[j]-32);
				}
				
				System.out.print(c[j]);
			}
			System.out.print(" ");
			
		}

	}

}
