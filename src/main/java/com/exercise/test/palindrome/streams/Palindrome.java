package com.exercise.test.palindrome.streams;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome {
	
	private Palindrome() {}

	/**
	 * Checks if a string is a palindrome.
	 *
	 * @param str the string to check.
	 * @return true if the string is a palindrome, otherwise false.
	 */
	private static boolean isPalindrome(String str) {
	    return IntStream.range(0, str.length() / 2)
	            .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
	}

	/**
	 * Determines if a string is an even-odd palindrome.
	 *
	 * @param s the string to check.
	 * @return true if both even-indexed and odd-indexed characters are palindromes, otherwise false.
	 */
	public static boolean isEvenOddPalindrome(String s) {
	    // Filters characters at even indices
	    String evenChars = IntStream.range(0, s.length())
	            .filter(i -> i % 2 == 0)
	            .mapToObj(s::charAt)
	            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	            .toString();

	    // Filters characters at odd indices
	    String oddChars = IntStream.range(0, s.length())
	            .filter(i -> i % 2 != 0)
	            .mapToObj(s::charAt)
	            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
	            .toString();

	    // Checks if both strings (even and odd indexed) are palindromes
	    Predicate<String> isPalindromePredicate = Palindrome::isPalindrome;

	    return isPalindromePredicate.test(evenChars) && isPalindromePredicate.test(oddChars);
	}

}
