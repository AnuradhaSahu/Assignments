package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment_4 {

	public static void main(String[] args) {
		/**
		 * 1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		 * 2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		 * 3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value. 
		 * 4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		 */
		
		//1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.

//		List<Integer> areaofTop5LargestCities =new LinkedList<Interger>();
//
//		areaofTop5LargestCities.add(289);
//		areaofTop5LargestCities.add(1200);
//		areaofTop5LargestCities.add(1400);
//		areaofTop5LargestCities.add(2300);
//		areaofTop5LargestCities.add(789);
//		
//        int TotalAreaof3rdand4thcity=(areaofTop5LargestCities.get(2)+areaofTop5LargestCities.get(3));
//		System.out.println("total area of the 3rd and 4th cities combined  : "+TotalAreaof3rdand4thcity);
//		System.out.println("************************************************");		
		
		String[] cities= {"Tokyo","Amsterdam","Delhi","Mumbai","Paris"};
		
		int[] areainsquaremeters= {798,2344,3455,665,2334};
		
		int TotalAreaof3rdand4thcity =areainsquaremeters[2]+areainsquaremeters[3];
		
        System.out.println("Total area of the 3rd and 4th cities combined  : "+TotalAreaof3rdand4thcity);
		
		System.out.println("************************************************");		
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
          
		Set<String> mostVisitedTouristAttractions =new HashSet<String>();
		
		mostVisitedTouristAttractions.add("Louvre Museum – Paris, France");
		mostVisitedTouristAttractions.add("Eiffel Tower – Paris, France");
		mostVisitedTouristAttractions.add("Colosseum – Rome, Italy");
		mostVisitedTouristAttractions.add("Empire State Building – New York City, USA");
		mostVisitedTouristAttractions.add("Anne Frank House – Amsterdam, Netherlands");
		mostVisitedTouristAttractions.add("Basílica de la Sagrada Familia – Barcelona, Spain");
		mostVisitedTouristAttractions.add("Gardens by the Bay – Singapore");
		mostVisitedTouristAttractions.add("Duomo di Milano – Milan, Italy");
		mostVisitedTouristAttractions.add("Sheikh Zayed Grand Mosque – Abu Dhabi, UAE");
		mostVisitedTouristAttractions.add("Cayman Crystal Caves – Grand Cayman, Caribbean");
		
		System.out.println("Top 10 most visited tourist attractions in the world "+mostVisitedTouristAttractions);
		System.out.println("The size of the set is "+ mostVisitedTouristAttractions.size());
		
		System.out.println("************************************************");		

        //3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value. 
           
		int[] numbers = new int[10];

		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		numbers[5]=60;
		numbers[6]=70;
		numbers[7]=80;
		numbers[8]=90;
		numbers[9]=100;
		
		int Average = (numbers[4]+numbers[5])/2;

		System.out.println("Average of 5th and 6th Value : "+Average);

		
		System.out.println("************************************************");		

		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
               
		List<String> movies = new ArrayList<String>();

		movies.add("Deadpool & Wolverine");
		movies.add("Wicked");
		movies.add("Despicable Me 4	");
		movies.add("Moana 2");
		movies.add("Inside Out 2");

		System.out.println("Printing out the third movie on the list: "+movies.get(2));
		
		
	}

}
