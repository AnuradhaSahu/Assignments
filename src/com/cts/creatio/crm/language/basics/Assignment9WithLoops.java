package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment9WithLoops {
	
	String name;
	double experience;
	double hikePercent;
	double hike;
	double rating;
	double baseSalary;
	double variablePay;
	int bonus;
	int extraPerks;
	
	
	Assignment9WithLoops(String name,double baseSalary, double experience,double rating){
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
		
		List<Assignment9WithLoops> emp = new ArrayList<Assignment9WithLoops>();
		
		emp.add(new Assignment9WithLoops("Alice Johnson", 75000.0, 5.1, 4.2));
		emp.add(new Assignment9WithLoops("Bob Smith", 68000.0, 3.2, 3.8));
		emp.add(new Assignment9WithLoops("Carol Davis", 82000.0, 7.1,4.5));
		emp.add(new Assignment9WithLoops("David Brown", 90000.0, 10.2, 2.5));
		emp.add(new Assignment9WithLoops("Eva Green", 60000.0, 2.4, 3.5));

        Map<String, Double> hikeMap = new HashMap<>();

        for(Assignment9WithLoops e : emp) {
            hikeMap.put(e.name, e.calculateHikePercentage());
        }
		System.out.println(hikeMap);
	}

}
