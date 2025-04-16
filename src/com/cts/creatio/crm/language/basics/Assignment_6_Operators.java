package com.cts.creatio.crm.language.basics;

public class Assignment_6_Operators {

	public static void main(String[] args) {

		/**
		 * 
		 * @author -Anuradha
		 * 
		 * Assignment - 6(Arrays/Datatypes/Operators)
		 * 
		 * 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
		 * and store it into another array, after adding 10 marks identify the average
		 * marks of all students
		 * 
		 * Expected Output: Updated Marks: Suresh: 85 Mahesh: 90 Naresh: 92
		 * Average Marks: 89.0
		 */
		
		//Creating string array to store student names
		String[] studentNames = new String[3];
		
		studentNames[0]="Suresh";
		studentNames[1]="Mahesh";
		studentNames[2]="Naresh";
		
		//Creating int array to store student marks
		int[] studentMarks = new int[3];

		studentMarks[0] = 75;
		studentMarks[1] = 80;
		studentMarks[2] = 82;
		
		//creating int array to store updated marks of students
		int[] studentMarksUpdate = new int[3];

		studentMarksUpdate[0] = studentMarks[0]+10;
		studentMarksUpdate[1] = studentMarks[1]+10;
		studentMarksUpdate[2] = studentMarks[2]+10;
		
		System.out.println("Student marks before :"+studentMarks[0]+studentMarks[1]+studentMarks[2]);
		System.out.println("Student marks after update : "+studentMarksUpdate[0]+studentMarksUpdate[1]+studentMarksUpdate[2]);

		int average =(studentMarksUpdate[0]+studentMarksUpdate[1]+studentMarksUpdate[2])/3;
		System.out.println("The Average of student marks after update : "+average);

		
		
	}

}
