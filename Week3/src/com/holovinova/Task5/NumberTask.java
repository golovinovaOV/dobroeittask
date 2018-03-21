package com.holovinova.Task5;

import java.util.Arrays;

public class NumberTask {

	public static void main(String[] args) {
		int[][] numbers = { 
							{ 5, 3, 7, 3, 1, 9, 2, 9, 0, 4, 0 }, 
							{ 5, 3, 7, 3, 1, 9, 2, 9, 0, 4, 101 },
							{ -1, 3, 7, 3, 1, 9, 2, 9, 0, 4, 100 } 
						};

		int[] result;

		// test good input
		try {
			result = countNumbers(numbers[0]);
			System.out.println("In");
			System.out.println(Arrays.toString(numbers[0]));
			System.out.println("Out");
			System.out.println(Arrays.toString(result));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// test with bad input
		try {
			result = countNumbers(numbers[1]);
			System.out.println("In");
			System.out.println(Arrays.toString(numbers[1]));
			System.out.println("Out");
			System.out.println(Arrays.toString(result));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// test with bad input
		try {
			result = countNumbers(numbers[2]);
			System.out.println("In");
			System.out.println(Arrays.toString(numbers[2]));
			System.out.println("Out");
			System.out.println(Arrays.toString(result));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	// method that count occurrence of each index as element in array
	public static int[] countNumbers(int[] inArray) {
		// throw an exception if got empty array
		if (inArray == null) {
			throw new IllegalArgumentException("Argument can't be null!");
		}

		// maximum value in array
		int maxIndex;
		// minimum value in array
		int minIndex;
		// container for result of counting
		int[] result;
		// find maximum value in array to know how many indexes we need
		maxIndex = inArray[0];
		for (int i = 0; i < inArray.length; i++) {
			if (maxIndex < inArray[i]) {
				maxIndex = inArray[i];
			}
		}
		// throw an exception if max index is greater than 100
		if (maxIndex > 100) {
			throw new IllegalArgumentException("Maximum value in array should be less (or equal) than 100!");
		}
		// find minimum value in array to know how many indexes we need
		minIndex = inArray[0];
		for (int i = 0; i < inArray.length; i++) {
			if (minIndex > inArray[i]) {
				minIndex = inArray[i];
			}
		}
		// throw an exception if minimum value in array in less than 0
		if (minIndex < 0) {
			throw new IllegalArgumentException("Minimum value in array shouldn't be less than 0!");
		}
		// create array that will contain result of counting occurrence of each index as
		// element in inArray array
		result = new int[maxIndex + 1];
		// go through all indexes
		for (int i = 0; i < inArray.length; i++) {
			result[inArray[i]]++;
		}
		return result;

	}
}
