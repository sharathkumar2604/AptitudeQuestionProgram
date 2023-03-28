package com.xworkz.AshaMamAssigned.NumberSeriesProgram;

public class FindSmallestOfThree {

	public static void main(String[] args) {
		int number[]= {10,50,30,9};
		int num=10;
		
		for(int i=0;i<number.length;i++)
		{
			if(num>number[i])
			{
				num=number[i];
			}
		}
		System.out.println(num);
	}

}
