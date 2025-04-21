package loopStatements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class loopStatements {
	
	/**
	 * 
	 * @param args
	 * Loop statements- loop the statements by using conditions- repeat the statements
	 * 
	 * for loop- for and for each=> for loop - when we know the total number of iterations to be executed
	 * for each loop- when we want to repeat the execution based on pre defined list of value
	 * 
	 * while loop- while and do while
	 * when we dont know the total number of iterations to be executed until condition statisfies
	 * while loop will start as infite loop- inside loop we need to add condition to stop the loop
	 * 
	 * do while loop-
	 */

	public static void main(String[] args) {

		String name = "Anuradha";
		
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
//		System.out.println(name);
		
		
		//for(condition 1, condition 2,condition3) {//condition 1- where to begin- we use numbers as we can increase or decrese
			//condition 2- where to stop
			//condition3 - to specify the interval
			
			//statements
		//}

		for(int i=1;i<=10;i++) {
		//	System.out.println(name);
			System.out.println(i+name);
		}
		
		for(int i=10;i>0;i--) {
			System.out.println(i+name);
		}
		
		/*
		 * while(condition)
		 * {
		 *condition to break;
		 *statements
		 * }
		 */
		
		String text="Refresh the page";
		int i=1;
		while(i>0) {//infinte loop
			//condition to break 
			
			if(i>10) {
				break;
			}
			System.out.println(text);
			i++;// if we dont use this then the value of i will always be 1 and it will not increase
		}
		
		
		/*
		 * for each
		 */
		
		String[] empNames = new String[3];

		empNames[0] = "Anu";
		empNames[1] = "Rakesh";
		empNames[2] = "Robin";
		
		//normally if we want to print each value - 
		System.out.println(empNames[0]);
		System.out.println(empNames[1]);
		System.out.println(empNames[2]);
		
	//	using for loop
		
		for(int j=0;i<=empNames.length;j++) {
			System.out.println(empNames[i]);
		}
		
	// using for each loop- no need to use condition as we are printing all the values
		
		for(String emp : empNames) {
			System.out.println(emp);
		}

Map<String,String> productDetail1 = new HashMap<String,String>();
		
		productDetail1.put("Product ID","P001");
		productDetail1.put("Name","Laptop");
		productDetail1.put("Catagory","Electronics");
		productDetail1.put("Price","$1,200");
		productDetail1.put("Stock Quantity","50");
		productDetail1.put("Supplier","Tech Supplies");
		productDetail1.put("Warranty","2 years");
		productDetail1.put("Rating","4.5");
		productDetail1.put("Manufacturing Date","1/15/2023");
		productDetail1.put("Expiry Date","1/15/2025");
		
		System.out.println("1st Product details are : "+productDetail1);
		
		Map<String, String> productDetail2 = new HashMap<String, String>();

		productDetail2.put("Product ID", "P001");
		productDetail2.put("Name", "Desk Chair");
		productDetail2.put("Catagory", "Furniture");
		productDetail2.put("Price", "$150");
		productDetail2.put("Stock Quantity", "100");
		productDetail2.put("Supplier", "Office Depot");
		productDetail2.put("Warranty", "1 years");
		productDetail2.put("Rating", "4");
		productDetail2.put("Manufacturing Date", "2/10/2023");
		productDetail2.put("Expiry Date", "N/A");

		System.out.println("2nd Product details are : " + productDetail2);
		
		Map<String, String> productDetail3 = new HashMap<String, String>();

		productDetail3.put("Product ID", "P001");
		productDetail3.put("Name", "Laptop");
		productDetail3.put("Catagory", "Electronics");
		productDetail3.put("Price", "$1,200");
		productDetail3.put("Stock Quantity", "50");
		productDetail3.put("Supplier", "Tech Supplies");
		productDetail3.put("Warranty", "2 years");
		productDetail3.put("Rating", "Tech Supplies");
		productDetail3.put("Manufacturing Date", "1/15/2023");
		productDetail3.put("Expiry Date", "1/15/2025");

		System.out.println("3rd Product details are : " + productDetail3);
		
		//list of all the products details
		
		List<Map<String,String>> productDetails =new ArrayList<Map<String,String>>();
		
		productDetails.add(productDetail1);
		productDetails.add(productDetail2);
		productDetails.add(productDetail3);			
		
		for(Map<String,String> product : productDetails) {//array/list/set only to be used and not map it is usefull when we want to get all the data from list at a time but its disadvantage is when we want to get from some index to another then we have to use for loop 
				System.out.println(product);
		}
		
		
		//Do while loop
		int k=1;
//		while(k>0){
//			System.out.println(k);//infinite loop
//			k++;
//		}
		
		do {
			System.out.println(k);
			k++;
		}while(k>1);//atleast 1 time loop will be executed
//		
		
		
		
	}

}
