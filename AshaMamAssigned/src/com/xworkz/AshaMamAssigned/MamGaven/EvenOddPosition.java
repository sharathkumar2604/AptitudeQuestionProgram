package com.xworkz.AshaMamAssigned.MamGaven;

public class EvenOddPosition {
	
	public static void main(String[] args) {
		
	
	int count=1;
	int n=6;

	
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(count%2);
			count++;
		}
		System.out.println();
	}

}
}
