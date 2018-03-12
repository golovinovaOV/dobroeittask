package com.holovinova;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		testMultiplesOfTwoSum();
	}

	public static int getMultiplesOfTwoSum(int[] array) {
		// here I'm going to save sum of numbers
		int multiplesOfTwoSum = 0;

		// go through all numbers that I get as argument
		for (int i = 0; i < array.length; i++) {
			// if number is multiples of 2 add it to sum
			if (array[i] % 2 == 0) {
				multiplesOfTwoSum += array[i];
			}
		}
		// return the result
		return multiplesOfTwoSum;
	}

	public static void testMultiplesOfTwoSum() {
		// array that contains numbers that multiples of two
		int a[] = { 2, 45, 18, 144, 16 };
		// array that not contains numbers that multiples of two
		int b[] = { 3, 7, 9, 145, 111 };
		// array that contains only multiples of two numbers
		int c[] = { 12, 14, 48, 150, 178 };
		// output the results 
		System.out.println(Arrays.toString(a) + "\nSum of numbers that multiples of two: " + getMultiplesOfTwoSum(a));
		System.out.println(Arrays.toString(b) + "\nSum of numbers that multiples of two: " + getMultiplesOfTwoSum(b));
		System.out.println(Arrays.toString(c) + "\nSum of numbers that multiples of two: " + getMultiplesOfTwoSum(c));
	}
}
