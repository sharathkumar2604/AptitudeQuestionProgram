package com.xworkz.AshaMamAssigned.MamGaven;

public class PatternRhombas {
	
	
//      *       
//   *  *  *    
//*  *  *  *  * 
//   *  *  *    
//      *       


	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == 2 || j == 2 || i == 1 && j == 1 || i == 1 && j == 3 || i == 3 && j == 1 || i == 1 && j == 3
						|| i + j == 6) {
					System.out.print(" * ");

				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
