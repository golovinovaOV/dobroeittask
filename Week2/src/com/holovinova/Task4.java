package com.holovinova;

public class Task4 {
	public static void main(String[] args) {
		int number = 9;
		// get factorial using iteration algorithm
		System.out.println("Iteration. "+ number + "! = " + iterationFactorial(number));
		// get factorial using recursive algorithm
		System.out.println("Recursive. "+ number + "! = " + recursiveFactorial(number));
	}
	
	// iteration algorithm
	public static long iterationFactorial(int number) {
		long result = 1;		
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	// recursive algorithm
	public static long recursiveFactorial(int number) {
		if (number == 0) {
			return 1;
		} else {
			return number * recursiveFactorial(number - 1);
		}
	}
}
