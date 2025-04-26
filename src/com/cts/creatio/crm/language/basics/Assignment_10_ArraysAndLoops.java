package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment_10_ArraysAndLoops {

	/**
	 * @author anugi
	 * @param args
	 * 
	 *             Given values are 12 ,34,11,36,87,98,93.
	 *              Store the values in Array and Print second and third largest number from the above values
	 *             without using collections and default sort methods
	 */
	public static void main(String[] args) {

		int[] numbers = {12 ,34,11,36,87,98,93};		
		
		int temp;

		for(int i=0;i<=numbers.length;i++) {
			
			for(int j=i+1; j<numbers.length;j++) {
				
				if(numbers[i]<numbers[j]) {
					
					temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j] = temp;					
				}
			}			
		}
		
		System.out.println("2nd largest in array "+numbers[1]);
		System.out.println("3rd largest in array "+numbers[2]);
	}
}
