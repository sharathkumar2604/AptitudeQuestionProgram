package com.xworkz.AshaMamAssigned.MamGaven;

import java.util.Scanner;

public class Square {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
	while(true) {	
	System.out.println("enter the value for n");
		
	int a=n.nextInt();
	int sqrt=0;
	
//	
//	for(int i=a;i>0;i--)
//	{
//		for(int j=i;j>i;i--)
//		{
//			
//		}
//		
//	}
		
	if(a==0)
	{
		System.out.println("zero"+0);
		
	}
		if(a>0)
		{
			sqrt=a*a;
		}
		System.err.println(sqrt);
	}

}
}