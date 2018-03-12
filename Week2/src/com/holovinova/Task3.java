package com.holovinova;

public class Task3 {
	public static void main(String[] args) {
		int[][] a = { { 12, 1, -3 }, { 4, -2, 7 }, { 14, 45, -2 } };
		printTwoDimensionalArray(a);
	}
	
	public static void printTwoDimensionalArray(int[][] a) {
		// go through first dimension of array
		for (int i = 0; i < a.length; i++) {
			// go through second dimension of array
			for (int j = 0; j < a[i].length; j++) {
				// print element
				System.out.print(a[i][j] + "\t");
			}
			// new line for the next row of array
			System.out.println();
		}
	}
}
