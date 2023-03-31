package com.xworkz.AshaMamAssigned.MamGaven;

public class PrintPrimeNumber1toN {

	public static void prime(int n)
	{
		if(n>0)
		{
			prime(n-1);
			System.out.print(n);
		}
		
	}
	public static void main(String[] args) {
		prime(10);
		
		
	}
	
	
}
