package com.xworkz.AshaMamAssigned.MamGaven;

public class NumberPattern {
	
	public static void main(String[] args) {
		
		
		int n=10;
	
		
		for(int i=1;i<=n;i++)
			
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
