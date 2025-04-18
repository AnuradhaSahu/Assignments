package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_5_collections_Map {

	public static void main(String[] args) {
		
		/**
		 * @author -Anuradha
		 * 
		 * Inside this Excel There are 3 TestCases with each Testcase having 3 rows of
		 * data. Now, Create Map<String, Map<String,String>> to store all the data and
		 * Print the data from Product details > Supplier Name > Office Depot from the
		 * Map<String, Map<String,String>>
		 */
		
		//Storing one by one student detail data in map
		
		Map<String,String> studentDetail1 = new HashMap<String,String>();
		
		studentDetail1.put("Name","John Doe");
		studentDetail1.put("Age","20");
		studentDetail1.put("Gender","Male");
		studentDetail1.put("Roll Number","S12345");
		studentDetail1.put("Grade","A");
		studentDetail1.put("Major","Computer Science");
		studentDetail1.put("GPA","3.8");
		studentDetail1.put("Email","john@example.com");
		studentDetail1.put("Contact Number","9876543210");
		studentDetail1.put("Address","123 Elm St");
		System.out.println("1st Student details : "+studentDetail1);

		
		//Student data 2
		Map<String,String> studentDetail2 = new HashMap<String,String>();
		
		studentDetail2.put("Name"," Jane Smith");
		studentDetail2.put("Age","21");
		studentDetail2.put("Gender","Female");
		studentDetail2.put("Roll Number","S12346");
		studentDetail2.put("Grade","B");
		studentDetail2.put("Major","Mathematics");
		studentDetail2.put("GPA","3.5");
		studentDetail2.put("Email","jane@example.com");
		studentDetail2.put("Contact Number","9876543211");
		studentDetail2.put("Address","456 Oak St");
		System.out.println("2nd Student details : "+studentDetail2);


		//student data 3
		Map<String,String> studentDetail3 = new HashMap<String,String>();
		
		studentDetail3.put("Name","Mike Brown");
		studentDetail3.put("Age","22");
		studentDetail3.put("Gender","Male");
		studentDetail3.put("Roll Number","S12347");
		studentDetail3.put("Grade","A");
		studentDetail3.put("Major","Physics");
		studentDetail3.put("GPA","3.9");
		studentDetail3.put("Email","mike@example.com");
		studentDetail3.put("Contact Number","9876543212");
		studentDetail3.put("Address","789 Pine St");
		System.out.println("3rd Student details : "+studentDetail3);
		
		//Storing all the studet details in one list
		
		List<Map<String,String>> StudentdetailsList = new ArrayList<Map<String,String>>();
		StudentdetailsList.add(studentDetail1);
		StudentdetailsList.add(studentDetail2);
		StudentdetailsList.add(studentDetail3);
		System.out.println("Studet details are :"+StudentdetailsList);

		//Storing Employee details in each employee map-Employee data 1
		
		Map<String, String> employeeDetail1 = new HashMap<String, String>();

		employeeDetail1.put("Employee ID", "E001");
		employeeDetail1.put("Name", "Alice Green");
		employeeDetail1.put("Age", "30");
		employeeDetail1.put("Gender", "Female");
		employeeDetail1.put("Department", "Engineering");
		employeeDetail1.put("Position", "Software Engineer");
		employeeDetail1.put("Major", "Computer Science");
		employeeDetail1.put("Salary", "75,000");
		employeeDetail1.put("Email", "alice@example.com");
		employeeDetail1.put("Contact Number", "9876543213");
		System.out.println("1st Employee details : " + employeeDetail1);

		// Employee data 2
		Map<String, String> employeeDetail2 = new HashMap<String, String>();

		employeeDetail2.put("Employee ID", "E002");
		employeeDetail2.put("Name", " Bob Johnson");
		employeeDetail2.put("Age", "35");
		employeeDetail2.put("Gender", "Male");
		employeeDetail2.put("Department", "Marketing");
		employeeDetail2.put("Position", "Marketing Manager");
		employeeDetail2.put("Salary", "85,000");
		employeeDetail2.put("Email", "bob@example.com");
		employeeDetail2.put("Contact Number", "9876543214");
		System.out.println("2nd Employee details : " + employeeDetail2);

		// Employee data 3
		Map<String, String> employeeDetail3 = new HashMap<String, String>();

		employeeDetail3.put("Employee ID", "E003");
		employeeDetail3.put("Name", "Carol White");
		employeeDetail3.put("Age", "28");
		employeeDetail3.put("Gender", "Female");
		employeeDetail3.put("Department", "Sales");
		employeeDetail3.put("Position", "Sales Executive");
		employeeDetail3.put("Salary", "65,000");
		employeeDetail3.put("Email", "carol@example.com");
		employeeDetail3.put("Contact Number", "9876543215");
		System.out.println("3rd Employee details : " + employeeDetail3);
		
		//Storing all the Employee details in one list

		List<Map<String, String>> employeedetailsList = new ArrayList<Map<String, String>>();
		employeedetailsList.add(employeeDetail1);
		employeedetailsList.add(employeeDetail2);
		employeedetailsList.add(employeeDetail3);
		System.out.println("Employee details are :" + employeedetailsList);
		
		//Storing product details in MAP and then storing all of that in one List<MAP<String,String>>
		
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
		
		System.out.println("All the data related to product details are as follows \n"+productDetails);
		
		//printing Supplier- "Office depot" from product detail 2
		System.out.println("printing Supplier- \"Office depot\" from product detail 2 "+productDetail2.get("Supplier"));

		


	}

}
