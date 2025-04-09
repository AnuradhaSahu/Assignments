package com.cts.creatio.crm.language.basics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Assignment_1_DataTypes {

	public static void main(String[] args) {

		/*
		 * Assignment 1 -DataTypes
		 * In this assignment we are going to verify different DataTypes and print the values.
		 */
		
		// 1.Temperature of a city in degrees Celsius: 25.5
		float temperature = 25.5f;
		System.out.println("Temperature of a city in degrees Celsius: " + temperature);

		// 2. Whether a customer has placed an order: true or false
		boolean orderplaced = true;
		System.out.println("Whether a customer has placed an order:" + orderplaced);

		// 3. Person's phone number: "123-456-7890"
		long phoneNumber = 123 - 456 - 7890;
		System.out.println("Person's phone number: " + phoneNumber);

		// 4. Amount of money in a customer's bank account: 1000.50
		double moneyinAccount = 1000.50;
		System.out.println("Amount of money in a customer's bank account: " + moneyinAccount);

		// 5. Person's email address: "john.doe@example.com"
		String email = "john.doe@example.com";
		System.out.println("Person's email address: " + email);

		// 6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double latitude = 37.7749;
		double longitude = -122.4194;
		System.out.println("Coordinates of a location (latitude, longitude):" + latitude + "," + longitude);

		// 7. Person's marital status: true or false
		boolean isMarried = false;
		System.out.println("Person's marital status: " + isMarried);

		// 8. Person's occupation: "Software Engineer"
		String occupation = "Software Engineer";
		System.out.println("Person's occupation : " + occupation);

		// 9. Person's favourite colour: "Blue"
		String favoriteColor = "Blue";
		System.out.println("Person's favourite colour: " + favoriteColor);

		// 10.Current year: 2023
		short year = 2023;
		System.out.println("Current year: " + year);

		// 11.Number of followers on a social media platform: 1,000,000
		int noofFollowers = 1000000;
		System.out.println("Number of followers on a social media platform: " + noofFollowers);

		// 12.Rating of a movie: 7.5
		float rating = 7.5f;
		System.out.println("Rating of a movie:" + rating);

		// 13.Person's blood type: 'A'
		char bloodGroup = 'A';
		System.out.println("Person's blood type: " + bloodGroup);

		// 14.Title of a book: "To Kill a Mockingbird"
		String TitleofBook = "To Kill a Mockingbird";
		System.out.println("Title of a book:  " + TitleofBook);

		// 15.Number of employees in a company: 500
		short noofEmployees = 500;
		System.out.println("Number of employees in a company: " + noofEmployees);

		// 16.Time of an event: 2:30 PM
		LocalTime time=LocalTime.of(14, 30);//2.30 pm in 24- hour format
		
		String formattedTime=time.format(DateTimeFormatter.ofPattern("h:mm a"));
		System.out.println("Time of an event:"+formattedTime);

		// 17.Name of a country: "United States"
		String country = "United States";
		System.out.println("Name of a country: " + country);

		// 18.Person's eye color: "Brown"
		String eyeColor = "Brown";
		System.out.println("Person's eye color:  " + eyeColor);

		// 19.Person's birthplace: "New York City"
		String birthplace = "New York City";
		System.out.println("Person's birthplace: " + birthplace);

		// 20.Distance between two cities: 200.5
		float distance = 200.5f;
		System.out.println("Distance between two cities:  " + distance);

	}

}
