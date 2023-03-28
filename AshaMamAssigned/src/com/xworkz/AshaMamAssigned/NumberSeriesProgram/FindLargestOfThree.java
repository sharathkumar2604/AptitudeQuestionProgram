package com.xworkz.AshaMamAssigned.NumberSeriesProgram;

public class FindLargestOfThree {

	public static void main(String[] args) {
		int number[]= {10,20,30};
		int num=1;
		
		for(int i=0;i<number.length;i++)
		{
			if(num<number[i])
			{
				num=number[i];
			}
		}
		System.out.println(num);
	}
}
