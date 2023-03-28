package com.xworkz.AshaMamAssigned.NumberSeriesProgram;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
	
	int num=10;
	int r=1;
	int sum=0;
	int temp = num;
	
	
	
	while(num>0)
	{
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		
	}
	

	System.out.println(sum);
}
}