package com.cts.creatio.crm.language.basics;

public class Assignment_13_primeNumbers {
	/**
	 * @author anugi
	 * @param args
	 * 
	 * Identify Prime numbers from an array
	 */
	public static boolean isPrimeNumber(int number) {
	
		if( number <= 1 ) {
			return false;
		}
		
		for(int i=2 ; i<number; i++) {
				if( number % i == 0 )
					return false;
		}
		return true;	
	}
	
	public static void main(String[] args) {

		int[] primeArray = new int[9];
		primeArray[0]=2;
		primeArray[1]=3;
		primeArray[2]=4;
		primeArray[3]=5;
		primeArray[4]=6;
		primeArray[5]=7;
		primeArray[6]=8;
		primeArray[7]=9;
		primeArray[8]=10;
				
		for (int array : primeArray) {
			
			if(isPrimeNumber(array)){
				System.out.println(array +" is a Prime number");
			}
			else {
				System.out.println( array+" is Not a Prime number");
			}
			
		}


	}

}
