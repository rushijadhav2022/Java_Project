package com.String_Array_Logical;

public class Count_Consonent_Owel_Numbers {

	public static void main(String[] args) {

		String str = "Rushi12kesh";
		str = str.toLowerCase();
		int vowels = 0;
		int cons = 0;
		int num = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'))

			{
				vowels++;
			} else if (ch > 'a' && ch < 'z') {
				cons++;
			}

			else if (ch >= '0' || ch <= '9') {
				num++;
			}

		}
		System.out.println(" Vowels " + vowels + " Consonent " + cons + " Numbers " + num);

	}

}
