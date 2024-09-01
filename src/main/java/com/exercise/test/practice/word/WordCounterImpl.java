package com.exercise.test.practice.word;

import java.util.SortedMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.exercise.test.practice.logic.EqualityVsIdentity;

public class WordCounterImpl {
	private static final Logger logger = LogManager.getLogger(EqualityVsIdentity.class);

	public void textCounter() {
		String frase = "El estribillo de una chirigota de Cádiz es Como como como como estoy como estoy";
		SortedMap<String, Integer> result = WordCounter.wordCounts(frase);

		logger.info("Word frequency map: {}", result);
	}

}
