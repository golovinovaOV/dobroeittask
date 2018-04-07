package com.holovinova.BinarySearch;

/**
 * Realization of binary search algorithm
 * @author Golovinova Oksana
 */
public class BinarySearch {
	
	/**
	 * Realization of binary search algorithm (iterative version)
	 * Returns index of element if it's present or -1 if it's not found
	 * @param data 
	 * @param element 
	 * @return int 
	 */
	public static int iterativeBinarySearch(int[] data, int element) {
		//set right barrier
		int right = data.length - 1;
		//set left barrier
		int left = 0;
		//variable for middle element index
		int middle;
		//set index to -1 - in case there is no such element in array
		int index = -1;
		//while left barrier less or equal to right barrier - do steps
		while(left <= right) {
			//find middle index
			middle = (left + (right - left)) /2;
			//in we found the element
			if (data[middle] == element) {
				index = middle;
				break;
			}else {
				//element in middle position greater then element - move right barrier
				if (data[middle] > element) {
					right = middle - 1;
				}else {
					//element in middle position less then element - move left barrier
					if(data[middle] < element) {
						left = middle + 1;
					}
				}
			}
		}
		return index;
	}
	
	/**
	 * Realization of binary search algorithm (recursive version)
	 * Returns index of element if it's present or -1 if it's not found
	 * @param data 
	 * @param element 
	 * @return int 
	 */
	public static int recursiveBinarySearch(int[] data, int element, int left, int right) {
		
		//variable for middle element index
		int middle;
		if(left <= right) {
			middle = (left + (right - left)) /2;				
			//in this case we found the element
			if (data[middle] == element) {
				return middle;
			}else {
				//element in middle position greater then element - go to right
				if (data[middle] > element) {
					return recursiveBinarySearch(data, element, middle - 1, right);
				}else {
					//element in middle position less then element - go to left side
					if(data[middle] < element) {
						return recursiveBinarySearch(data, element, left, middle + 1);
					}
				}
			}
		}
		return -1;
	}
}
