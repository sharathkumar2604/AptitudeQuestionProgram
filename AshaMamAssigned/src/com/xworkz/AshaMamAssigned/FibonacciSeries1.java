package com.xworkz.AshaMamAssigned;

//recursion method

public class FibonacciSeries1 {

	static int n1=0,n2=1,n3=0;
	
	
	void call(int count) {
		if(count>0) {
		n3 = n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+",");
		call(count-1);
		
		
	}
}
	public static void main(String[] args) {

		int count =10;
		System.out.print(n1+","+n2+",");
		FibonacciSeries1 d = new FibonacciSeries1();
		d.call(count-2);
		
	}
}