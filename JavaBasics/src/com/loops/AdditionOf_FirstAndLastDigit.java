package com.loops;
import java.util.Scanner;
public class AdditionOf_FirstAndLastDigit {

	public static void main(String[] args) {
  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int firstdigit;
		int lastdigit;
		int rev = 0;
		int sum=0;
		lastdigit = num % 10;
		while (num > 0) {

			int digit = num % 10;
			rev = rev * 10 + digit;
             num=num/10;
		}
		
		firstdigit=rev%10;
		sum=firstdigit+lastdigit;
		System.out.println(sum);
	}

}
