package com.exercise.test.palindrome.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeCheck {

	public void exaplesStreamsAnyMatch() {
		String str = "kayak";

		// Fragment 1: Checks if at least one comparison is true (any character matches)
		boolean result1 = IntStream.range(0, str.length())
				.anyMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
		System.out.println("Fragment 1: " + result1); // Should print true

		// Fragment 2: Checks if at least one comparison is false (any character does not match)
		boolean result2 = IntStream.range(0, str.length())
				.anyMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		System.out.println("Fragment 2: " + result2); // Should print false

		// Fragment 3: Checks if there are no false comparisons (all characters match)
		boolean result3 = IntStream.range(0, str.length() / 2)
				.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));
		System.out.println("Fragment 3: " + result3); // Should print true

		// Fragment 4: Checks if there are no matches (no character matches)
		boolean result4 = IntStream.range(0, str.length() / 2)
				.noneMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
		System.out.println("Fragment 4: " + result4); // Should print false

		// Fragment 5: Checks if at least one comparison is true using Stream.iterate
		boolean result5 = Stream.iterate(0, i -> i + 1).limit(str.length())
				.anyMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
		System.out.println("Fragment 5: " + result5); // Should print true
	}

}
