package com.lab_assignment;
import java.util.Scanner;
public class Pencils {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Standard");
        int standard=sc.nextInt();
        int sum=0;
        
        if(standard>0 && standard<12)
        {
        	for(int i=1;i<=standard;i++)
        	{
        		sum=sum+i*i;
        	}
        	
        	System.out.println("Neela gets "+sum+" pencils");
        }
        else
        {
        	System.out.println("Invalid Standard");
        }
		
		
		
	}

}
