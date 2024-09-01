package com.exercise.test.util;

public class NumberUtil {

	private NumberUtil() {
	}

	/**
	 * Checks if the given number is between 1 and 5 (inclusive) or equals 9.
	 *
	 * @param num the integer to check
	 * @return true if the number is between 1 and 5 or equals 9, false otherwise
	 */
	public static boolean isValidNumber(int num) {
	    return (num >= 1 && num <= 5) || num == 9;
	}

	/**
	 * Compares two primitive int values for equality.
	 *
	 * This method simulates the behavior of the equals() method used for objects, 
	 * but is specifically designed for primitive int values. It returns true 
	 * if the two int values are equal, otherwise returns false.
	 *
	 * @param a the first int value to compare
	 * @param b the second int value to compare
	 * @return true if the int values are equal, false otherwise
	 */
	public static boolean equals(int a, int b) {
	    return a == b;
	}
	
	/**
	 * Calculates the maximum value from an array of integers.
	 *
	 * @param numbers an array of integers
	 * @return the maximum value among the integers in the array
	 * @throws IllegalArgumentException if the array is null, empty, or if any integer is greater than 10
	 */
	public static int maxTenOfArray(int[] numbers) {
	    if (numbers == null || numbers.length == 0) {
	        throw new IllegalArgumentException("The array must not be null or empty.");
	    }

	    int max = numbers[0]; // Assume the first element is the maximum

	    for (int num : numbers) {
	        if (num > 10) {
	            throw new IllegalArgumentException("Array contains a value greater than 10: " + num);
	        }
	        max = Math.max(max, num); // Update max if current num is greater
	    }

	    return max;
	}
	
	/**
	 * Calculates the maximum value from an array of integers.
	 *
	 * @param numbers an array of integers
	 * @return the maximum value among the integers in the array
	 * @throws IllegalArgumentException if the array is null or empty
	 */
	public static int maxOfArray(int[] numbers) {
	    if (numbers == null || numbers.length == 0) {
	        throw new IllegalArgumentException("The array must not be null or empty.");
	    }

	    int max = numbers[0]; // Assume the first element is the maximum

	    for (int num : numbers) {
	        max = Math.max(max, num); // Update max if current num is greater
	    }

	    return max;
	}

}
