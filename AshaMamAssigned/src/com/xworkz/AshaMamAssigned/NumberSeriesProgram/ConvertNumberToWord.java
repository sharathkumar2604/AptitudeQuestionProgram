package com.xworkz.AshaMamAssigned.NumberSeriesProgram;

import java.util.Scanner;

public class ConvertNumberToWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter");
		int num = scan.nextInt();

		if (num < 0 || num > 999) {
			System.out.print("not valid number");
		} 
		else {
			int last = num % 10;
			int divided = num / 10;
			int next = num % 10;
			int first = num / 10;
			String firstNinteen[] = { "zero ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
					"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
					"ninteen" };
			String tens[] = { " ", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety",
					"hundred" };
			String hun = "hundred";

			if (num < 20) {
				System.out.println(firstNinteen[num]);
			}

			else if (num < 100) {

				System.out.println(tens[next] + firstNinteen[first]);
			} 
			else {
				System.out.println(firstNinteen[first] + hun + tens[next] + firstNinteen[last]);
			}

		}
	}
}
