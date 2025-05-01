package com.cts.creatio.crm.language.basics;

public class Assignment_12_powerofNUsingMath {
	
	/**
	 * @author anugi
	 * @param args 
	 * Implement pow(x, n), which calculates x raised to the power n
	 * (i.e., x ^n). Example 1: Input: x = 2.00000, n = 10 Output:1024.00000
	 * Example 2: Input: x = 2.10000, n = 3 Output: 9.26100
	 * Example 3: Input: x = 2.00000, n = -2 Output: 0.25000
	 * Explanation: 2*  -2 = 1/22 = 1/4 = 0.25
	 */
	
	static double y;
	
	public static double power(double x, int n) {
		y=Math.pow(x, n);		
		return y;
	}

	public static void main(String[] args) {

//		int x =2;		//This is hardcoded , we dont want that
//		int n=10;		
//		double y= Math.pow(2, 10);		
//		System.out.println(y);
		
		//example 1
		y=power(2,10);
		System.out.println("The Power of x to the power n ,here x is 2 and n is 10 is "+y);
		
		//Example 2: Input: x = 2.10000, n = 3 Output: 9.26100
		y=power(2.10,3);
		System.out.println(y);
		
		// Example 3: Input: x = 2.00000, n = -2 Output: 0.25000
		y=power(2.00,-2);
		System.out.println(y);
	}

}
