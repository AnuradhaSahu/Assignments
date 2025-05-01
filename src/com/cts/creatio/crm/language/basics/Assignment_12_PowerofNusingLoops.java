package com.cts.creatio.crm.language.basics;

public class Assignment_12_PowerofNusingLoops {

	/*
	 * Implement pow(x, n), which calculates x raised to the power n
	 * (i.e., x ^n). Example 1: Input: x = 2.00000, n = 10 Output:1024.00000
	 * Example 2: Input: x = 2.10000, n = 3 Output: 9.26100
	 * Example 3: Input: x = 2.00000, n = -2 Output: 0.25000
	 * Explanation: 2*  -2 = 1/22 = 1/4 = 0.25
	 * 
	 * 2^10= 1(2^0)/2^10
	 * anything to the power 0 is 1
	 * 
	 */
	public static void main(String[] args) {
		
		double base = 2;
		double exponent = 10;
		double result = 1;
		
	
		if( exponent == 0 ) {
			result= 1;
		}
		
		if( exponent < 0 ){
			base = 1 / base;
			exponent = -exponent;			
		}
		
		for(int i=0 ; i<exponent ; i++) {
			result = result * base;
		}
		
		System.out.println(result);		
	}

}
