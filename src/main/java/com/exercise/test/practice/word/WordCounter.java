package com.exercise.test.practice.word;

import java.util.SortedMap;
import java.util.TreeMap;

public class WordCounter {
	
	private WordCounter() {}
	/**
     * Counts the frequency of each word in a given phrase and returns a sorted map with the word frequencies.
     *
     * @param frase the input string representing the phrase
     * @return a sorted map where each word (in lowercase) is mapped to its frequency of occurrence in the phrase
     */
    public static SortedMap<String, Integer> wordCounts(String frase) {
        // Create a TreeMap to store the word counts in sorted order
        SortedMap<String, Integer> wordCounts = new TreeMap<>();

        // Split the phrase into words using " " as a delimiter
        String[] words = frase.toLowerCase().split(" ");

        // Iterate through each word in the phrase
        for (String word : words) {
            // Check if the word is already in the map
            if (wordCounts.containsKey(word)) {
                // If the word is already in the map, increment its count by 1
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                // If the word is not in the map, add it with a count of 1
                wordCounts.put(word, 1);
            }
        }

        // Return the sorted map with word counts
        return wordCounts;
    }
}
