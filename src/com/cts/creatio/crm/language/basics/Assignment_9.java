package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_9 {
	/**
	 * @author Anuradha 
	 * There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the Values in Map with
	 * EmployeeName and HikePercentagevalue and Print them.
	 * Ex: Map<String, Double> output ;
	 */
	
	double experience;
	double hikePercent;
	double hike;
	double rating;
	double baseSalary;
	double variablePay;
	int bonus;
	int reward = 5000;
	
	
	//Creating method to calculate hike
	double hike() {
		hike = (( baseSalary * variablePay )/100) + bonus + reward ;
		return hike;
	}
	
	//Creating method to calculate hike %
	double hikePercent() {
		hikePercent = ( hike/ baseSalary )/100 ;
		return hikePercent;
	}
	
	//creating method for extra reward 
	double extraPerks() {
		if(experience >=5) {
			bonus = bonus+reward;
		}
		return bonus;
	}
	
	//creating constrctir of the class and initialising class variables
	Assignment_9(double experience,	double hikePercent,	double hike,double rating, double baseSalary,double variablePay,int bonus,	int reward){

		this. rating = rating;
		this. baseSalary = baseSalary;
		this. variablePay = variablePay;
		this. bonus = bonus;
	}
	

	public static void main(String[] args) {

		//creating Map of the data of 5 employees and storig the data
		Map< String, String >  employee1 = new HashMap<String , String>();
		
		employee1.put("S.No", "1");
		employee1.put("Name", "Alice Johnson");
		employee1.put("BaseSalary", "75000.0");
		employee1.put("Experience (Years)", "5.1");
		employee1.put("Year-End Rating (Out of 5)", "4.2");

		System.out.println("display all the data from employee 1 "+employee1);
		
		Map<String, String> employee2 = new HashMap<String, String>();

		employee2.put("S.No", "2");
		employee2.put("Name", "Bob Smith");
		employee2.put("BaseSalary", "68000.0");
		employee2.put("Experience (Years)", "3.2");
		employee2.put("Year-End Rating (Out of 5)", "3.8");

		System.out.println("display all the data from employee 2 " + employee2);

		Map<String, String> employee3 = new HashMap<String, String>();

		employee3.put("S.No", "3");
		employee3.put("Name", "Carol Davis");
		employee3.put("BaseSalary", "82000.0");
		employee3.put("Experience (Years)", "7.1");
		employee3.put("Year-End Rating (Out of 5)", "4.5");

		System.out.println("display all the data from employee 3 " + employee3);

		Map<String, String> employee4 = new HashMap<String, String>();

		employee4.put("S.No", "4");
		employee4.put("Name", "David Brown");
		employee4.put("BaseSalary", "90000.0");
		employee4.put("Experience (Years)", "10.2");
		employee4.put("Year-End Rating (Out of 5)", "2.5");

		System.out.println("display all the data from employee 4 " + employee4);

		Map<String, String> employee5 = new HashMap<String, String>();

		employee5.put("S.No", "5");
		employee5.put("Name", "Eva Green");
		employee5.put("BaseSalary", "60000.0");
		employee5.put("Experience (Years)", "2.4");
		employee5.put("Year-End Rating (Out of 5)", "3.5");

		System.out.println("display all the data from employee 5 " + employee5);
		
		List<Map<String,String>> employeeList = new ArrayList<Map<String , String>>();
			
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		
		
		System.out.println("display all the employee data " + employeeList);
		
	
			

//		
//		//for(Map<String, String> emp : employeeList)
//			for(int i=0;i<employeeList.size();i++){
//			
//			if( obj.experience >= 5 ) {
//				obj.extraPerks();
//			    System.out.println("As the Experience of the employee is >=5 years so rewarding the employee with extra perks "+ obj.extraPerks());			
//			    
//			    if( obj.rating >= 4 ) {
//				    obj.baseSalary = 15.0;
//				    obj.bonus = 1500;	
//				    obj.hike();
//				    obj.hikePercent();
//				    System.out.println("The Hike Percent and hike for rating 4 and above is "+   obj.hike()+ obj.hikePercent());
//			     }
//			    else if((obj.rating>=3) && (obj.rating<4)){
//			    	obj.baseSalary = 10.0;
//				    obj.bonus = 1200;	
//				    obj.hike();
//				    obj.hikePercent();
//				    System.out.println("The Hike Percent and hike for ratings between 3 and 4 is "+   obj.hike()+ obj.hikePercent());
//			     }
//			    else {
//			    	obj.baseSalary = 3.0;
//			    	obj.bonus = 300;
//			    	obj.hike();
//				    obj.hikePercent();
//				    System.out.println("The Hike Percent and hike for employees with rating 3 and less is "+   obj.hike()+ obj.hikePercent());
//			    }
//		   }
		}
	}

