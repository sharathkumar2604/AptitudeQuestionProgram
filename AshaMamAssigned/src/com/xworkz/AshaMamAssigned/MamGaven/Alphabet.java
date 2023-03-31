package com.xworkz.AshaMamAssigned.MamGaven;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		
		
		for(int i=0;i<=n;i++)
		{
			char ch='a';
			for(int j=0;j<=i;j++)
			{
				
			
			System.out.print(ch);
		ch++;
		
		}
			System.out.println();
		}
		
		
	}

}
