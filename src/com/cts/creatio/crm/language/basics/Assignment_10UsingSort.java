package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment_10UsingSort {

	public static void main(String[] args) {
		
		int[] numbers = { 12, 34, 11, 36, 87, 98, 93 };

		Arrays.stream(numbers).sorted();

		System.out.println(numbers[numbers.length - 1]);// largest
		System.out.println(numbers[numbers.length - 2]);// 2nd largest
		System.out.println(numbers[numbers.length - 3]);// 3rd largest
		System.out.println(numbers[numbers.length - 7]);// smallezt
		
	}

}
