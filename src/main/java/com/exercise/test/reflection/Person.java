package com.exercise.test.reflection;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

	private void printPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
