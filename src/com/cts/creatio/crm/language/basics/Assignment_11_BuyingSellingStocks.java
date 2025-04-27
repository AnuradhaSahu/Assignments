package com.cts.creatio.crm.language.basics;

public class Assignment_11_BuyingSellingStocks {
	
	/**
	 * @author anuradha
	 * @param args
	 * 
	 *             Best Time to Buy and Sell Stock You are given an array prices
	 *             where prices[i] is the price of a given stock on the i th day.
	 *             You want to maximize your profit by choosing a single day to buy
	 *             one stock and choosing a different day in the future to sell that
	 *             stock. Return the maximum profit you can achieve from this
	 *             transaction. If you cannot achieve any profit, return 0.
	 * 
	 *             Example 1: Input: prices = [7,1,5,3,6,4] Output: 5 
	 *             Explanation:
	 *             Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit =
	 *             6-1 = 5. Note that buying on day 2 and selling on day 1 is not
	 *             allowed because you must buy before you sell. 
	 *             Example 2: Input:
	 *             prices = [7,6,4,3,1] Output: 0 
	 *             Explanation: In this case, no
	 *             transactions are done and the max profit = 0.
	 */

	
	public static void main(String[] args) {

		int[] prices = new int[6];
		
		prices[0] = 7;
		prices[1] = 1;
		prices[2] = 5;
		prices[3] = 3;
		prices[4] = 6;
		prices[5] = 4;
		
		int maxprofit = 0;
		
		int buyDay = -1;
		int sellDay = -1;
		
		
	for(int i=0;i<=prices.length;i++) { //this is traversing through array
		
		for(int j=i;j<=prices.length-1;j++) {// this is checking on which value is greater than previous 
			
			int profit = prices[j]-prices[i]; //storing the attained value from 2nd loop
			
			if( profit >maxprofit) {// condition checking in attained value  if the profit amount is greater then replace it with max profit
				
				maxprofit = profit;
				buyDay=i; // these are the days in which we got max profit
				sellDay=j;				
			}
		}		
	}
	
	System.out.println(maxprofit);// priint max profit 
	
	if(maxprofit >0) {
		System.out.println("Buy on day "+ buyDay +" Sell on day "+sellDay+ " With Max profit "+maxprofit);
	}
	else {
		System.out.println("No profit possible ");
	}
		
		
	}

}
