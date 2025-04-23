package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_9_ConditionalandWithoutLoops {
	
	String name;
	double experience;
	double hikePercent;
	double hike;
	double rating;
	double baseSalary;
	double variablePay;
	int bonus;
	int extraPerks;
	
	
	Assignment_9_ConditionalandWithoutLoops(String name,double baseSalary, double experience,double rating){
		this.name = name;
		this.baseSalary = baseSalary;
		this.experience = experience;
		this.rating = rating;
	}
	
	
	double calculateHikePercentage() {
			
		 if( rating >= 4 ) {
			 variablePay = 15.0;		
			    bonus = 1500;				    
		     }
		    else if((rating>=3) && (rating<4)){
		    	variablePay = 10.0;
			    bonus = 1200;	
			   }
		    else {
		    	variablePay = 3.0;
		    	bonus = 300;
		      }
		//using ternery operator to check    (x>y) ? x : y; // (true) 
		 extraPerks=(experience>=5)? 5000:0;
		
		hike = (( baseSalary * variablePay )/100) + bonus + extraPerks ;
		
		hikePercent = ( hike/ baseSalary )*100 ;
		return hikePercent;
		
		
	}
	public static void main(String[] args) {
		 
		//creating class object
		Assignment_9_ConditionalandWithoutLoops emp1 = new Assignment_9_ConditionalandWithoutLoops("Alice Johnson", 75000.0, 5.1, 4.2);
		Assignment_9_ConditionalandWithoutLoops emp2 = new Assignment_9_ConditionalandWithoutLoops("Bob Smith", 68000.0, 3.2, 3.8);
		Assignment_9_ConditionalandWithoutLoops emp3 = new Assignment_9_ConditionalandWithoutLoops("Carol Davis", 82000.0, 7.1,4.5);
		Assignment_9_ConditionalandWithoutLoops emp4 = new Assignment_9_ConditionalandWithoutLoops("David Brown", 90000.0, 10.2, 2.5);
		Assignment_9_ConditionalandWithoutLoops emp5 = new Assignment_9_ConditionalandWithoutLoops("Eva Green", 60000.0, 2.4, 3.5);

		System.out.println(	emp1.calculateHikePercentage());
		System.out.println(	emp2.calculateHikePercentage());
		System.out.println(	emp3.calculateHikePercentage());
		System.out.println(	emp4.calculateHikePercentage());
		System.out.println(	emp5.calculateHikePercentage());
				
		Map<String,Double> hikeMap = new HashMap<String, Double>();
		
		hikeMap.put(emp1.name, emp1.calculateHikePercentage());
		hikeMap.put(emp2.name, emp2.calculateHikePercentage());
		hikeMap.put(emp3.name, emp3.calculateHikePercentage());
		hikeMap.put(emp4.name, emp4.calculateHikePercentage());
		hikeMap.put(emp5.name, emp5.calculateHikePercentage());
		
		System.out.println(hikeMap);



			}

}
