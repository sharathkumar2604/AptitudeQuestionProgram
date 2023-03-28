package com.xworkz.AshaMamAssigned;

public class PalindromeProgram {

	public static void main(String[] args) {
	int n=221;
	int r=0;
	int temp=n;
	int sum=0;
	
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	System.out.println(temp);
	System.out.println(sum);
	
	if(sum==temp)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	}
	
}
