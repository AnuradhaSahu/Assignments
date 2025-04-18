package com.cts.creatio.crm.language.basics;

public class Assignment_7_ConditionalStatements {
	/**
	 * @author Anuradha
	 * @param args
	 * 
	 *             Assignment-7 (Conditional Statements)
	 * 
	 *             A bank evaluates loan applicants based on the following criteria:
	 *             
	 *             1. Credit Score: o If the credit score is above 750, the loan is
	 *             automatically approved. o If the credit score is between 650 and
	 *             750, additional checks are performed. o If the credit score is
	 *             below 650, the loan is denied.

                   2. Income: o For credit scores  between 650 and 750, the customer’s 
                   income must be at least $50,000 for the loan to be considered.
	 * 
	 *             3. Employment Status: o If the customer’s income is at least
	 *             50,000, the system checks whether the customer is employed. o If
	 *             the customer is unemployed, the loan is denied.
	 *             
	 *              4. Debt-to-Income  Ratio: o If the customer is employed, the system
	 *             checks the debt-to-income (DTI) ratio. o If the DTI ratio is less than 40%,
	 *             the loan is approved. o If the DTI ratio is 40% or greater, the
	 *             loan is denied.
	 * 
	 *             Now based on below details, print whether user is eligible to get
	 *             the loan or not 
	 *             customerName = "John Doe"; creditScore = 720;
	 *             income = 55000.0; isEmployed = true; debtToIncomeRatio = 35.0;
	 */

	
	public static void creditScore(int creditScore) {
		
		if(creditScore >750)
			System.out.println("Loan Approved");
				else if(creditScore>650 && creditScore<750)
					System.out.println("Additional Checks needs to be performed");
		else
			System.out.println("Loan Denied");
	}

	public static void isEmployedandIncomeanddebtToIncomeRatio(boolean isEmployed,int income,float debtToIncomeRatio) {
		
		if((isEmployed==true && income>50000) && debtToIncomeRatio>40 )
			System.out.println("Loan approved");
		else
			System.out.println("Loan Denied");
	}
	
			
	public static void main(String[] args) {
		
		String customerName = "John Doe"; 
		int creditScore = 720;
		double income = 55000.0; 
		boolean isEmployed = true; 
		float debtToIncomeRatio = 35.0f;
		
// created separate function and calling them		
//		creditScore(770);
//		isEmployedandIncomeanddebtToIncomeRatio(true,50000,40);
		
		/*----------can use this as well--------------
		if (creditScore < 650 && (isEmployed == false && debtToIncomeRatio > 40)) {
			System.out.println("Loan Denied");
		}
		else if ((creditScore >= 650 && creditScore < =750) && (income >= 50000 && isEmployed == true)) {
			System.out.println("Additional checks are to be performed");
		} else {
			// ((creditScore>750) && (debtToIncomeRatio < 40))
			System.out.println("Loan Approved");
		}
		*/
		
		if(creditScore>750) {
			System.out.println("Loan Approved");
		}
		else if((creditScore >= 650) && (creditScore <= 750)) {
			System.out.println("Additional checks are to be performed");
    		if(income >= 50000) {
    			System.out.println("Income is sufficient !!!");
    			if(isEmployed == true) {
    				System.out.println("Customer is employed !!!");
    				if(debtToIncomeRatio < 40) {
    					System.out.println("Loan Approved");
    				}
    				else {
    					System.out.println("Loan Denied");
    				}
    			}
    			else {
    				System.out.println("Loan Denied");
    			}
    		}
    		else {
				System.out.println("Loan Denied");
			}	
       	}
		else {
			System.out.println("Loan Denied");
		}
	}
	
	
}	
	

		


