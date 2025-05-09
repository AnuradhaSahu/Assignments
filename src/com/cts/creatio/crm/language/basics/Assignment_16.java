package com.cts.creatio.crm.language.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment_16 {
	/**
	 * @param args A@author anugi
	 * 
	 *             Assignment: Write a program to search for all occurrences of a
	 *             “Java” word in the paragraph and print their indexes. 1. Divide
	 *             into multiple words 2. Find total number of occurrences 3. Print
	 *             count and Indexes of the word
	 * 
	 *             
	 */

	public static void main(String[] args) {
		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		
		//1. Divide into multiple words
		String [] splittedText = paragraph.split(" ");
		System.out.println(splittedText[0]);
		System.out.println(splittedText[5]);
		System.out.println(splittedText[9]);
		System.out.println(splittedText[10]);

		String[] word = paragraph.split(" ");
		System.out.println("Words in paragraph");
		
		for (String e : word) {
			
			System.out.println(e);		
		}
		
		//2. Find total number of occurrences 
		
        // Split into words
		String[] words = paragraph.split(" ");
		
		//for counting the number of words
        // Use HashMap to store word counts
		Map< String , Integer > countword = new HashMap<>();
		
		for(String e : words) {
			
			if(countword.containsKey(e)) {
				countword.put(e, countword.get(e)+1);
			}
			else {
				countword.put(e, 1);
			}
		}
		
		//printing the retirved information
		for(Map.Entry<String, Integer> entry:  countword.entrySet()) {

			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	
		//3. Print count and Indexes of the word
		String paragraph1 = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
           
		String wordtobefound = "Java";
		
		//split the paragraph into words
		String[] wordss = paragraph1.split("");
		
		int count =0;
		int index= 0;
		
		System.out.println("Index of teh word :	 "+wordtobefound);
		
		for(String e : wordss) {
			//clean the punctuations
			String cleanwords = e.replaceAll("[^a-zA-Z]", "");
			
			if(cleanwords.equals(wordtobefound)) {
				
				int foundAt = paragraph1.indexOf(wordtobefound,index);
				
				System.out.println(foundAt);
				count ++;
				index = foundAt + wordtobefound.length();//moving the index forward
			}
		}
		System.out.println("Total occurence " + count);
		
		
	}

}
