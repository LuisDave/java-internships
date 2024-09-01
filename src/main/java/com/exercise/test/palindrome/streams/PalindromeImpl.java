package com.exercise.test.palindrome.streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PalindromeImpl {

    private static final Logger logger = LogManager.getLogger(PalindromeImpl.class);

    public void validPalindrome() {
        String[] words = {"abccba", "racecar", "aabbcc", "level", "noon"};

        for (String word : words) {
            boolean result = Palindrome.isEvenOddPalindrome(word);

            if (result) {
                logger.info("The string \"{}\" is an even-odd palindrome.", word);
            } else {
                logger.info("The string \"{}\" is not an even-odd palindrome.", word);
            }
        }
    }
}
