package com.xworkz.AshaMamAssigned.MamGaven;

//
//    *
//  ***
//*****
//  ***
//    *

public class Rhombas2 {

public static void main(String[] args) {
		
		
		int n=5;
		int str=1;
		int space=n/2;
		int a=97;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
				
			}
			for(int k=0;k<str;k++)
			{
				
				System.out.print("*");
				
			}
			if(i<n/2)
			{
				str=str+2;
				space--;
				
			}
			else
			{
				str=str-2;
				space++;
				
				
			}
			System.out.println("");
		}
	}


	
}
