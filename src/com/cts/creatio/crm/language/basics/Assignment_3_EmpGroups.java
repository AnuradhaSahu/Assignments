package com.cts.creatio.crm.language.basics;

public class Assignment_3_EmpGroups {
	
	
	/*
	 * @Author-Anuradha create another class called EmpGroups that contains two
	 * arrays to store the employee names and IDs.
	 * 
	 * Retrieve the data from the Employees class, store it in these arrays, and
	 * finally print each employee's name along with their corresponding ID.
	 * Example: • Employee Name: Bharath, Employee ID: 1234
	 */

	public static void main(String[] args) {

		
		//creating object of Employees class to access its members
		Assignment_3_Employees obj= new Assignment_3_Employees();
		
		
		//creating empty array to store employee names
		String[] empNames =new String[3];
		
		empNames[0]=obj.employeeNames[0];
		empNames[1]=obj.employeeNames[1];
		empNames[2]=obj.employeeNames[2];

		//creating empty array to store employee Ids
		int[] empIds = new int[3];
		empIds[0]=obj.employeeID[0];
		empIds[1]=obj.employeeID[1];
		empIds[2]=obj.employeeID[2];

		//print each employee's name along with their corresponding ID. 
		System.out.println("Employee Name : "+empNames[0]+","+"Employee ID : "+empIds[0]);
		System.out.println("Employee Name : "+empNames[1]+","+"Employee ID : "+empIds[1]);
		System.out.println("Employee Name : "+empNames[2]+","+"Employee ID : "+empIds[2]);

		


		
	}

}
