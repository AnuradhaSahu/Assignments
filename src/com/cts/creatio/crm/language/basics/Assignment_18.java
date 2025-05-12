package com.cts.creatio.crm.language.basics;

public class Assignment_18 {
/**
 * @author anugi
 * @param args
 * 
 * Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */
	public static void main(String[] args) {

		String  Sentence = "A man, a plan, a canal: Panama";
		
		String s = Sentence.replaceAll(" ", "");// remove white space

		//removing special characters 		
		String newValue = s.replaceAll("[,:]", "");
		System.out.println(newValue);

		//converting all upper case into lower case
        String lower = newValue.toLowerCase();
        System.out.println(lower);
		
        //verifying if the given string is a pallindrome or not
       
        //empty string
        String rev ="";
        
        for(int i=lower.length()-1; i>=0; i--) {
          
        	rev = rev+ lower.charAt(i);
        	
        }
		System.out.println(rev);
		
		if(lower == rev) {
			System.out.println("This is a pallindrome");
		}
		else {
			System.out.println("This is not a pallindrome");
		}
	}

}
