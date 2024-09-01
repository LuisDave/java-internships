package com.exercise.test.practice.singleton;

public class LoggerSingleton {

    // Single instance of the Singleton
    private static LoggerSingleton instance = null;

    // Private constructor to prevent direct instantiation
    private LoggerSingleton() {
        // Here you could initialize resources, such as opening a log file
    }

    // Public static method to get the single instance
    public static LoggerSingleton getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        // In a real case, this would write the message to a file
        System.out.println("Log entry: " + message);
    }
}