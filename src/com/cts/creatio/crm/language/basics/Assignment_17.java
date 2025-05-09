package com.cts.creatio.crm.language.basics;

public class Assignment_17 {

	/**
	 * @author anugi
	 * @param args
	 * Assignment: Write a program to print * in triangle pattern
1. If I will pass int rows = 5 then it should print triangle with 5 Rows
*
**
***
****
*****
	 */
	public static void main(String[] args) {

		int rows = 5; // Number of rows

		for (int i = 1; i <= rows; i++) {

			// Print i stars
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}
}




