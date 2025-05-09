package com.cts.creatio.crm.language.basics;

public class Assignment15 {

	/**
	 * @author- anuradha
	 * @param args
	 *  Assignment: Write a program to perform the following tasks: 1.
	 *             Count the total number of words in the sentence. 2. Print the
	 *             sentence words in reverse order. 3. Convert the first character
	 *             of each word to uppercase and print original sentence
	 * 
	 *             String sentence = "Java programming is fun and challenging";
	 */

	public static String capitalLetter(String str) {
		String[] word = str.split(" ");
		StringBuilder  capitalLetter = new StringBuilder();

		for(String  e : word) {
			
			if(e.length() > 0 ) {
				capitalLetter.append(Character.toUpperCase(e.charAt(0))).append(e.substring(1).toLowerCase()).append("");
			}
			
		}		
		return capitalLetter.toString().trim();		
	}
	
	
	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging"; 
		
		//Count the total number of words in the sentence
		System.out.println("The number of words in the given sentence is "+ sentence.length());
		
		//2. Print the sentence words in reverse order.
		String reverseorder = " ";
		
		for(int i = sentence.length()-1 ; i > 0 ; i--) {
			
			reverseorder = reverseorder+sentence.charAt(i);
		}
		
		System.out.println(reverseorder);
		
		//3. Convert the first character of each worad to uppercase and print original sentence
		
		String result = capitalLetter(sentence);
		
		System.out.println(result);
	}

}
