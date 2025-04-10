package com.cts.creatio.crm.language.basics;

public class Assignment_2_Arrays {

	public static void main(String[] args) {
		/*
		 * @author : Anuradha
		 * 
		 * Problem: Multi-Dimensional Array Practice
		 * 
		 * 1. Create a 3D array to represent the following data: o Semesters as the
		 * first dimension. o Subjects and Status/Marks as the second dimension. o
		 * Actual values for Subject Names and Marks as the third dimension.
		 * 
		 * 2. From the array: o Print Semester 2 Subject 4 and Subject 5 names. o Print
		 * the Status/Marks of Semester 4 Subject 3 and Subject 6.
		 */

		// 5 semsters, each semester - 2 groups (sub, marks), subjects-6
		
		String[][][] multiArray = new String[5][2][6];

		// semester 1 subjects and marks
		multiArray[0][0][0] = "Mathematics 1";
		multiArray[0][0][1] = "Physics";
		multiArray[0][0][2] = "Chemistry";
		multiArray[0][0][3] = "Computer Programming";
		multiArray[0][0][4] = "Engineering Drawing";
		multiArray[0][0][5] = "Basic Electrical Eng.";

		multiArray[0][1][0] = "Pass(78)";
		multiArray[0][1][1] = "Pass(85)";
		multiArray[0][1][2] = "Fail(21)";
		multiArray[0][1][3] = "Pass(74)";
		multiArray[0][1][4] = "Pass(88)";
		multiArray[0][1][5] = "Pass(79)";

		// semester 2 subjects and marks
		multiArray[1][0][0] = "Mathematics II";
		multiArray[1][0][1] = "Mechanics";
		multiArray[1][0][2] = "Environmental Sci";
		multiArray[1][0][3] = "Basic Electronics";
		multiArray[1][0][4] = "Engineering Physics";
		multiArray[1][0][5] = "Engineering Graphics";

		multiArray[1][1][0] = "Pass(82)";
		multiArray[1][1][1] = "Pass(77)";
		multiArray[1][1][2] = "Pass(93)";
		multiArray[1][1][3] = "Fail(19)";
		multiArray[1][1][4] = "Fail(24)";
		multiArray[1][1][5] = "Pass(90)";

		// semester 3 subjects and marks
		multiArray[2][0][0] = "Data Structures";
		multiArray[2][0][1] = "Discrete Mathematics";
		multiArray[2][0][2] = "Digital Electronics";
		multiArray[2][0][3] = "Operating Systems";
		multiArray[2][0][4] = "Signals and Systems";
		multiArray[2][0][5] = "Object-Oriented Prog.";

		multiArray[2][1][0] = "Pass(88)";
		multiArray[2][1][1] = "Pass(81)";
		multiArray[2][1][2] = "Pass(76)";
		multiArray[2][1][3] = "Fail(32)";
		multiArray[2][1][4] = "Pass(85)";
		multiArray[2][1][5] = "Pass(78)";

		// semester 4 subjects and Marks
		multiArray[3][0][0] = "Algorithms";
		multiArray[3][0][1] = "Computer Networks";
		multiArray[3][0][2] = "Database Systems";
		multiArray[3][0][3] = "Microprocessors";
		multiArray[3][0][4] = "Communication Eng.";
		multiArray[3][0][5] = "Software Engineering";

		multiArray[3][1][0] = "Pass(91)";
		multiArray[3][1][1] = "Pass(73)";
		multiArray[3][1][2] = "Fail(19)";
		multiArray[3][1][3] = "Pass(80)";
		multiArray[3][1][4] = "Pass(76)";
		multiArray[3][1][5] = "Pass(87)";

		// semester 5 subjects and marks
		multiArray[4][0][0] = "Probability & Stats";
		multiArray[4][0][1] = "Machine Learning";
		multiArray[4][0][2] = "Compiler Design";
		multiArray[4][0][3] = "Theory of Computation";
		multiArray[4][0][4] = "Embedded Systems";
		multiArray[4][0][5] = "Computer Graphics";

		multiArray[4][1][0] = "Pass(86)";
		multiArray[4][1][1] = "Pass(88)";
		multiArray[4][1][2] = "Pass(84)";
		multiArray[4][1][3] = "Pass(95)";
		multiArray[4][1][4] = "Pass(73)";
		multiArray[4][1][5] = "Pass(90)";

        //Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println(
				"Semester 2 subject 4 and 5 names are : " + multiArray[1][0][3] + " and " + multiArray[1][0][4]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6
		System.out.println("Semester 4  Status/Marks of 3 and 6 Subjects are : " + multiArray[3][1][2] + " and "
				+ multiArray[3][1][5]);
         
	}

}
