package com.xworkz.AshaMamAssigned;

import java.util.Scanner;

public class FibonacciSeries {
//without using recurssion

	public static void main(String[] args) {

		// the logic is adding the two number and print the next number is called
		// fibonaci series
		// like 0 1 1 2 3 5 8 13 21 34 55 is as get if i give count 10
		// before declare 0 and 1 bcz is constant

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the count to perform execution");
		int count = scan.nextInt();

		int a = 0, b = 1, c = 0, i;
		System.out.print(a + " " + b + " ");
		for (i = 2; i <= count; ++i) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}

	}
}
