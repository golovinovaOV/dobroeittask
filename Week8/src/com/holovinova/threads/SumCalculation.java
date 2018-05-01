package com.holovinova.threads;

import java.util.stream.LongStream;

public class SumCalculation {
	public static long getSumVersionTwo(long endNumber) {		
		return LongStream.rangeClosed(1, endNumber).sum();
	}

	public static long getSum(long endNumber) {
		long result = 0;
		for (int i = 1; i <= endNumber; i++) {
			result += i;
		}
		return result;
	}
}
