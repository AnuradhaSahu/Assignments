package com.cts.creatio.crm.language.basics;

public class Assignment_14_Pattern {

	public static void main(String[] args) {

		int n = 5;
		
		//upper part
		for(int i=1 ; i<=5;i++) {

			for(int j=1;j<=i;j++) {
				
				System.out.println(j +" ");
			}
			System.out.println();
		}
	   
	
	//lower part
	for(int i= n-1; i>=1;i--) {
		
		for(int j=1;j<=i;j++) {
			System.out.println(j +" ");
		}
		System.out.println();
	}

}
}
