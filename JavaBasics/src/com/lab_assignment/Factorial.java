package com.lab_assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        if(num<0)
        {
        	num=num*-1;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);

			}
		}
        }
		else 
		{
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.println(i);

				}
			}
		}
			
		}
	}


