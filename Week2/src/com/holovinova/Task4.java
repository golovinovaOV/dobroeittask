package com.holovinova;

public class Task4 {
	public static void main(String[] args) {
		int number = -9;
		long iterationResult;
		long recursiveresult;
		
		try {			
			// get factorial using recursive algorithm
			recursiveresult = recursiveFactorial(number);
			System.out.println("Recursive. " + number + "! = " + recursiveresult);			
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			// get factorial using iteration algorithm
			iterationResult = iterationFactorial(number);
			System.out.println("Iteration. " + number + "! = " + iterationResult);
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

	// iteration algorithm
	public static long iterationFactorial(int number) {
		long result = 1;
		if (number < 0) {
			throw new IllegalArgumentException("Iteration. Argument can't be less than zero");
		}
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	// recursive algorithm
	public static long recursiveFactorial(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("Recursive. Argument can't be less than zero");
		}
		if (number == 0) {
			return 1;
		} else {
			return number * recursiveFactorial(number - 1);
		}
	}
}
