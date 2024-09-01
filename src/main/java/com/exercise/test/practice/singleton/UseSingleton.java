package com.exercise.test.practice.singleton;

public class UseSingleton {
	
	/**
	 * Demonstrates the usage of the LoggerSingleton class.
	 * This method logs several events using the LoggerSingleton to show how
	 * a Singleton ensures that only one instance of the logger is used 
	 * throughout the application.
	 * The method also confirms that multiple references to the logger 
	 * point to the same instance by comparing them.
	 */
	public void loggerExample() {
		// Get the single instance of the Logger
		LoggerSingleton logger = LoggerSingleton.getInstance();

		// Log some events
		logger.log("Application started.");
		logger.log("Performing some operations...");
		logger.log("Application finished.");

		// Attempt to get another instance of the Logger
		LoggerSingleton anotherLogger = LoggerSingleton.getInstance();

		// Log another event to demonstrate that it's the same instance
		anotherLogger.log("This is the same logger instance.");

		// Check that both references point to the same instance
		if (logger == anotherLogger) {
			System.out.println("Both logger references point to the same instance.");
		}
	}
}