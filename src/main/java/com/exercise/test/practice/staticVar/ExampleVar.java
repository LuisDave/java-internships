package com.exercise.test.practice.staticVar;

public class ExampleVar {
    // Static variable to count the number of instances of the class
    private static int instanceCount = 0;

    public ExampleVar() {
        instanceCount++; // Increment the counter each time an instance is created
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
