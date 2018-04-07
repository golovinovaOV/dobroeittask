package com.holovinova.BinarySearch;

import org.junit.Test;
import org.junit.Assert;
/**
 * Test class for BinarySearch
 * @author Golovinova Ok
 *
 */
public class TestBinarySearch {
	
	/**
	 * Test iterative algorithm of binary search
	 */
	@Test
	public void testIterative() {
		int[] a = {-11, -5, 1, 5, 8, 8, 9, 20, 50};
		Assert.assertEquals(-1, BinarySearch.iterativeBinarySearch(a, 100));
		Assert.assertEquals(3, BinarySearch.iterativeBinarySearch(a, 5));
	}
	
	/**
	 * Test recursive algorithm of binary search
	 */
	@Test
	public void testRecursive() {
		int[] a = {-11, -5, 1, 5, 8, 8, 9, 20, 50};
		Assert.assertEquals(5, BinarySearch.recursiveBinarySearch(a, -11, 0, a.length - 1));
		Assert.assertEquals(-1, BinarySearch.recursiveBinarySearch(a, 7, 0, a.length - 1));
	}
	
}
