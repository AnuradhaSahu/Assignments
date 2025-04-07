package com.cts.creatio.crm.language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {

		//print the content and go to next line
		System.out.println("Hello, World!");
		System.out.println();
		
		//print the content and go to stay in the same line
		System.out.print("Hello, World!");
		System.out.println();

		//print the formatted content and stay on teh same line
		System.out.printf("%s is completed Btech,empid is %d, visa status is %b","Anu",1234,true);
		System.out.println();

		//print the char based on ASCII value
		System.out.write(65);
		System.out.println();
		
		
		//print logs of the program
		Logger log=Logger.getLogger("MyLogger");
		log.info("current line is 44");
		log.warning("There is some warning at line no 45, please check");
		
		//print the errors in print statement
		System.err.println("ERROR : Expected Result is not matching with actual Result");
		System.out.println();

		//add logs in log.txt file 
		PrintWriter writer=new PrintWriter("C:\\Automation Training\\AutomationProject\\Logs.txt");
		writer.println("line no 39 is running");
		writer.println("line no 40 is running");
		writer.println("line no 41 is running");
		writer.close();

		
		
	}

}
