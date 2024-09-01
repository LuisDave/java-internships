package com.exercise.test.practice.logic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.exercise.test.util.NumberUtil;

public class NumberValidator {

    private static final Logger logger = LogManager.getLogger(NumberValidator.class);

    public void validateRange() {
        int[] testNumbers = { 0, 2, 5, 6, 7, 8, 9, 10 };

        for (int num : testNumbers) {
            logger.info("Number - {} in range (1 and 5) or 9? {}", num, NumberUtil.isValidNumber(num));
        }
    }
    
    public void validateNumMax() {
        int[] numbers = {5, 10, 11};

        try {
            int result = NumberUtil.maxOfArray(numbers);
            logger.info("The maximum value in the array is: {}", result);
        } catch (IllegalArgumentException e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
    
    public void validateNumMaxOfTen() {
        int[] numbers = {5, 10, 30};

        try {
            int result = NumberUtil.maxTenOfArray(numbers);
            logger.info("The maximum value in the array is: {}", result);
        } catch (IllegalArgumentException e) {
            logger.error("An error occurred: {}", e.getMessage());
        }
    }
}
