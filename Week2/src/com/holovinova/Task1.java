package com.holovinova;

public class Task1 {
	public static void main(String[] args) {
		testPositiveNumberSum();
	}

	public static int getSumOfPositiveNumbers(int... numbers) {
		// here I'm going to save sum of numbers
		int sumOfPositiveNumbers = 0;
		// go through all numbers that I get as argument
		for (int i = 0; i < numbers.length; i++) {
			// if number is positive add it to sum
			if (numbers[i] > 0) {
				sumOfPositiveNumbers += numbers[i];
			}
		}
		// return the result
		return sumOfPositiveNumbers;
	}

	public static void testPositiveNumberSum() {
		// 3 numbers, only one negative
		// output the result
		System.out
				.println("[12, -145, 1938]\n" + "Sum of positive numbers: " + getSumOfPositiveNumbers(12, -455, 1938));

		// 3 numbers, all is negative
		// output the result
		System.out
				.println("[-12, -455, -1938]\n" + "Sum of positive numbers: " + getSumOfPositiveNumbers(-12, -455, -7));

		// 3 numbers, only one negative
		// output the result
		System.out.println("[12, 145, 1938]\n" + "Sum of positive numbers: " + getSumOfPositiveNumbers(12, 455, 1938));
	}

}
