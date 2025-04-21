package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment_8_ConditionalStatementsandLoop {
	/**
	 * @author anuradha
	 * 
	 * Assignment -8 (Conditional Statements & Loops)
	 * 
	 * Bank Transactions Positive value refers Credit and Negative refers Debit
	 * Transaction Transactions Amount 1 50000 2 -2000 3 3000 4 -15000 5 -200 6 -300
	 * 7 4000 8 -3000 
	 * 
	 * First Store all the transactions in any data structure of Your
	 * Choice from collections, and by using Loops and conditional statements
	 * 
	 *  1. Print total number of credit and debit transactions completed		 
	 *  2. Print the total amount credited and debited in account 
	 *  3. Print total amount remaining at the end in Bank Account
	 *  4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
	 *   Transaction with Amount” and also print total number of suspicious transactions
	 */

	public static void main(String[] args) {

//		List<Integer> transactionsCredited = new LinkedList<Integer>();
//		transactionsCredited.add(50000);
//		transactionsCredited.add(3000);
//		transactionsCredited.add(4000);
//		
//		List<Integer> transactionsDebited = new LinkedList<Integer>();
//
//		transactionsDebited.add(-3000); 
//		transactionsDebited.add(-15000);
//		transactionsDebited.add(-200);
//		transactionsDebited.add(-300);
//		transactionsDebited.add(-2000);
//				
//		//Print total number of credit and debit transactions completed
//	    System.out.println("Total  number of debit and credit transaction completed is "+(transactionsDebited.size()+transactionsCredited.size()));
//		
//	    for(int e :transactionsCredited) {
//	    	if(e>10000) {
//	    		System.out.println("Suspicious credit Transaction "+e);	    		
//	    	}
//	    }
//	  
//	    
//	    for(int e :transactionsDebited) {
//	    	if(e<-10000) {
//	    		System.out.println("Suspicious Debit Transaction "+e);	    		
//	    	}
//	    }
		
	
		List<Integer> transaction =new ArrayList<Integer>();
		
		transaction.add( 50000 );
		transaction.add( -2000 );
		transaction.add( 3000 );
		transaction.add( -15000 );
		transaction.add( -200 );
		transaction.add( -300 );
		transaction.add( 4000 );
		transaction.add( -3000 );

		int creditAmount=0;
		int debitAmount=0;
		int totalCredit=0;
		int totalDebit=0;
		int suspicousCount=0;

		for(int amount : transaction) {
			
			if( amount > 0 ) {
				creditAmount++;
				totalCredit += creditAmount;//adding to credit amount
				
				if( amount > 10000 ) {
					System.out.println("Suspicous credit transaction "+amount);
					suspicousCount++;
				}
			}
			else {
				debitAmount++;
				totalDebit += Math.abs(amount);
				
			    if( amount < -10000 ) {
			    	System.out.println("Suspicous debit transaction "+amount);
					suspicousCount++;
			    }
		    }	    
	      }
		
		int totalAmountRemaining=totalCredit-totalDebit;
		
		System.out.println("The Total number of credit and debit transactions completed are : "+totalCredit+totalDebit);
		System.out.println("Total Amount Credited "+creditAmount);
		System.out.println("Total Amount Debited "+debitAmount);
		System.out.println("Total Amount remianing "+totalAmountRemaining);
		System.out.println("Suspicious credit / debit transactions  = "+suspicousCount);
		
		System.out.println("*******************************************************************************************");
		
		Map<Integer,Integer> trs =new HashMap<Integer,Integer>();
		
		trs.put( 1, 50000 );
		trs.put( 2, -2000 );
		trs.put( 3,3000 );
		trs.put( 4,-15000 );
		trs.put( 5,-200 );
		trs.put( 6,-300 );
		trs.put( 7,4000 );
		trs.put( 8,-3000 );
		
		
		int credit=0;
		int debit=0;
		int totalCred=0;
		int totalDebi=0;
		int suspCount=0;
				
		for(Integer amount : trs.values()) {

			if(amount>0) {
				credit++;
				totalCred+=credit;
				
				if(amount>10000) {
					System.out.println("Suspicious transaction "+ amount);
					suspCount++;
				}
			}
			else {
				debit++;
			//	totalDebi+=debit;//as it is in negative so have to convert into positive using Maths.abs
				totalDebi+=Math.abs(amount);
				
				if(amount<-10000) {
					System.out.println("Suspicious transaction "+ amount);
					suspCount++;
				}				
			}			
		}
		
		int total=totalCred-totalDebi;
		
		System.out.println("The Total number of Credit and Debit Transactions completed are : "+totalCred+totalDebi);
		System.out.println("Total Amount Credited "+credit);
		System.out.println("Total Amount Debited "+debit);
		System.out.println("Total Amount remianing "+total);
		System.out.println("Suspicious Credit / Debit Transactions  = "+suspCount);
		
		
		
		

		


	}
}